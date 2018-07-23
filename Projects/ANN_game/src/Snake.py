from pygame.locals import *
from random import randint
import pygame
import time
import numpy as np
from PIL import Image
import datetime
import os

import InputAgent
import LogicNN
import VisionNN

windowWidth = 800
windowHeight = 600
step = 40
horizontal_space = windowWidth//step
vertical_space = windowHeight//step
sleep_time = 20.0
key_output = ['MR', 'ML', 'MU', 'MD', 'PR']

GameRecord = False

#AI Tags
using_AI = True
AI_type = {'random':True,'bys1':False,'beta':False,'bys1nbeta':False,'NN1':False,\
           'NN2':False}
beta_step = 5
train_Model={'NN1':False,'NN2':False}
critical_train = {'NN1':False,'NN2':False}
reading_Model = {'NN1':False,'NN2':False}
test_Model = {'NN1':False,'NN2':False}

using_VS = False
Vision_type = {'NN1':False,'NN2':False}
train_VModel = {'NN1':False,'NN2':False}
critical_vtrain = {'NN1':False,'NN2':False}
reading_VModel = {'NN1':False,'NN2':False}
test_VModel = {'NN1':False,'NN2':False}
inp_size2 = (160,120)



class Apple:
	x = 0
	y = 0

	def __init__(self,x,y):
		self.x = x
		self.y = y

	def draw(self, surface, image):
		surface.blit(image,(self.x*step, self.y*step))

	def reset_apple(self,x,y):
		self.x = x
		self.y = y


class Player:
	def __init__(self, length,initx,inity):
		self.x = []
		self.y = []
		self.direction = 0
		self.max_length = 40
		self.updateCountMax = 0
		self.updateCount = 0
		self.length = length

		for i in range(0,self.max_length):
			self.x.append(-1)
			self.y.append(-1)

		self.reset_player(length,initx,inity)

	def update(self):

		self.updateCount = self.updateCount + 1
		if self.updateCount > self.updateCountMax:

			self.check_length()

			# update previous positions
			for i in range(self.length-1,0,-1):
				self.x[i] = self.x[i-1]
				self.y[i] = self.y[i-1]

			# update position of head of snake
			if self.direction == 0:
				self.x[0] = self.x[0] + 1
			if self.direction == 1:
				self.x[0] = self.x[0] - 1
			if self.direction == 2:
				self.y[0] = self.y[0] - 1
			if self.direction == 3:
				self.y[0] = self.y[0] + 1

			self.updateCount = 0


	def moveRight(self):
		if self.direction != 1:
			self.direction = 0

	def moveLeft(self):
		if self.direction != 0:
			self.direction = 1

	def moveUp(self):
		if self.direction != 3:
			self.direction = 2

	def moveDown(self):
		if self.direction != 2:
			self.direction = 3

	def draw(self, surface, image):
		if self.max_length >= 20:
			surface.blit(image[0], (self.x[0] * step, self.y[0] * step))
			redu = self.max_length // 20
			re = 0
			last = 1
			for i in range(1, self.length):
				surface.blit(image[last], (self.x[i] * step, self.y[i] * step))
				re += 1
				if re > redu:
					last += 1
					re = 0
		else:
			for i in range(0, self.length):
				skip = int(20 / self.max_length)
				surface.blit(image[i*skip],(self.x[i]*step,self.y[i]*step))

	def reset_player(self,length,initx,inity):
		self.length = length
		for i in range(0,self.max_length):
			self.x[i] = -1
			self.y[i] = -1
		for i in range(0,length):
			self.x[i] = initx - i
			self.y[i] = inity
		self.direction = 0
		# self.update()

	def check_length(self):
		if self.length > self.max_length:
			self.length = self.max_length

	def copyself(self):
		newcopy = Player(-1,-1,-1)
		newcopy.x = self.x[:]
		newcopy.y = self.y[:]
		newcopy.direction = self.direction
		newcopy.length = self.length
		return newcopy

class Enemy:
	hori_number = horizontal_space
	vert_number = vertical_space
	enemy = []

	def __init__(self):
		for i in range(0,self.hori_number):
			self.enemy.append((i, 0))
		for i in range(0, self.hori_number):
			self.enemy.append((i, self.vert_number-1))
		for i in range(1, self.vert_number-1):
			self.enemy.append((0, i))
		for i in range(1, self.vert_number-1):
			self.enemy.append((self.hori_number-1, i))

	def draw(self, surface, image):
		for i in self.enemy:
			surface.blit(image,(i[0]*step,i[1]*step))

class Game:
	def isCollision(self,x1,y1,x2,y2,bsize):
		if x1 == x2:
			if y1 == y2:
				return True
		return False


class App:
	player = 0
	apple = 0
	screent = pygame.display.set_mode((windowWidth,windowHeight))
	auto_input = 0
	pause_flag = False
	end_flag = False
	dead_pause_flag = False
	player_init = (10,10)
	player_init_length = 3
	apple_init = (5,5)
	pause_loop_time = 100.0
	enemy = 0
	logicNN = 0

	def __init__(self):
		self._running = True
		self._display_surf = None
		self._image_surf = []
		self._apple_surf = None
		self._enemy_surf = None

		self.game = Game()
		self.player = Player(self.player_init_length,self.player_init[0],\
								self.player_init[1])
		self.apple = Apple(self.apple_init[0],self.apple_init[1])
		self.screect = None
		self.auto_input = InputAgent.InputAgent(key_output)
		self.enemy = Enemy()
		self.info = {}

		self.logicNN = LogicNN.LogicNN(key_output)
		self.visionNN = VisionNN.VisionNN()

		self.game_start_time = None
		self.path = None

	def on_init(self):
		pygame.init()
		self._display_surf = pygame.display.set_mode((windowWidth,windowHeight), pygame.HWSURFACE)

		pygame.display.set_caption('snake_test2')
		self._running = True

		self._image_surf.append(\
			pygame.image.load("../resource/white_circle_30_30.png").convert())
		gray_sca = 100
		for i in range(0,20):
			image_name = "../resource/"+str(gray_sca)+"_box_30_30.png"
			print(image_name)
			self._image_surf.append(pygame.image.load(image_name).convert())
			gray_sca -= 5
		self._apple_surf = pygame.image.load("../resource/circle_target.png").convert()
		self._enemy_surf = pygame.image.load("../resource/0_box_30_30.png").convert()

		if using_AI:
			self.auto_input.bys1_init()

			if AI_type['NN1']:
				if reading_Model['NN1']:
					self.logicNN.read_model1()
				else:
					self.logicNN.init_model1()
			if AI_type['NN2']:
				if reading_Model['NN2']:
					self.logicNN.read_model2()
				else:
					self.logicNN.init_model2()

		if using_VS:
			if Vision_type['NN1']:
				if reading_VModel['NN1']:
					self.visionNN.read_model1()
				else:
					self.visionNN.init_model1()
			if Vision_type['NN2']:
				if reading_VModel['NN2']:
					self.visionNN.read_model2()
				else:
					self.visionNN.init_model2(inp_size2=inp_size2)

		self.game_start_time = datetime.datetime.now()

		if GameRecord :
			self.path = "../../sc_"+str(self.game_start_time)
			if not os.path.exists(self.path):
				os.makedirs(self.path)



	def on_event(self, event):
		if event.type == QUIT:
			self._running = False

	def on_loop(self):
		self.player.update()

		# does snake eat apple?
		for i in range(0,self.player.length):
			if self.game.isCollision(self.apple.x,self.apple.y,self.player.x[i], self.player.y[i],44):
				self.apple.x = randint(2,horizontal_space-2)
				self.apple.y = randint(2,vertical_space-2)
				self.player.length = self.player.length + 1
				self.player.check_length()

		# does snake collide with itself?
		for i in range(2,self.player.length):
			if self.game.isCollision(self.player.x[0],self.player.y[0],self.player.x[i], self.player.y[i],40):
				print("You lose! Collision: ")
				print("x[0] (" + str(self.player.x[0]) + "," + str(self.player.y[0]) + ")")
				print("x[" + str(i) + "] (" + str(self.player.x[i]) + "," + str(self.player.y[i]) + ")")
				self.dead_pause_flag = True
				# exit(0)
		for eenemy in self.enemy.enemy:
			if self.game.isCollision(self.player.x[0], self.player.y[0],\
			                         eenemy[0], eenemy[1], 40):
				print("You lose! Wall Collision: ")
				print("x[0] (" + str(self.player.x[0]) + "," + str(self.player.y[0]) + ")")
				self.dead_pause_flag = True

	def on_render(self):
		self._display_surf.fill((0,0,0))
		self.enemy.draw(self._display_surf, self._enemy_surf)
		self.player.draw(self._display_surf, self._image_surf)
		self.apple.draw(self._display_surf, self._apple_surf)
		pygame.display.flip()

	def on_cleanup(self):
		pygame.quit()

	def on_execute(self):
		if self.on_init() == False:
			self._running = False

		self.on_render()

		while( self._running ):
			pygame.event.pump()
			keys = pygame.key.get_pressed()

			if using_VS:

				if Vision_type['NN1']:
					inp_all = np.zeros((300,1600),dtype=np.uint8)
					out_all = np.zeros((300,4),dtype=int)
					block_list = self.gener_inp_vmodel1()
					x = 0
					y = 0
					iter = 0
					crit_iter = 0
					for block in block_list:
						out = self.gener_out_vmodel1((x, y))
						if critical_vtrain['NN1']:
							if out[0,3] == 0:
								crit_iter += 1
								inp_all[crit_iter, :] = block[:].flatten()
								out_all[crit_iter, :] = out[:].flatten()
						elif train_VModel['NN1']:
							inp_all[iter,:] = block[:].flatten()
							out_all[iter,:] = out[:].flatten()
						y += 1
						if y > 14:
							x += 1
							y = 0
						iter += 1

					if critical_vtrain['NN1']:
						self.visionNN.crit_trainNN1(crit_iter,inp_all,out_all)
					elif train_VModel['NN1']:
						self.visionNN.gener_ioput(inp_all, out_all)
						self.visionNN.trainNN1()

					if (test_VModel['NN1']):
						x = 0
						y = 0
						tail_counter = 0
						for block in block_list:
							result = self.visionNN.predNN1(block[:].reshape(1,1600))
							if np.argmax(result.flatten()) == 0:
								tail_counter += 1
							elif np.argmax(result.flatten()) == 1:
								print("PLAYER",x,y)
							elif np.argmax(result.flatten()) == 2:
								print("FOOD",x,y)
							y += 1
							if y > 14:
								x += 1
								y = 0

						print("TAIL NUMBER",tail_counter)

				if Vision_type['NN2']:
					input_img = self.gener_inp_vmodel2()
					ouput = self.gener_out_vmodel2()
					inp_x,inp_y = inp_size2
					input_img2 = np.zeros((1,1,inp_x,inp_y))
					input_img2[0,0,:,:] = input_img[:,:]
					self.visionNN.gener_iopu2(input_img2,ouput)
					if train_VModel['NN2']:
						self.visionNN.trainNN2()
					if test_VModel['NN2']:
						outp = self.visionNN.predNN2(input_img2)
						print(outp)
						px = outp[0, 0]
						py = outp[0, 1]
						ax = outp[0, 2]
						ay = outp[0, 3]
						print("diff:",abs(px-self.player.x[0]),\
						        abs(py-self.player.y[0]), \
						        abs(ax - self.apple.x),\
						        abs(ay - self.apple.y),\
						            )

			if(using_AI):

				self.generate_info()


				if AI_type['random']:
					# Using random generation
					self.auto_input.generate_input()
					aiinput = self.auto_input.input

				if AI_type['bys1']:
					#Using bayesian1
					self.auto_input.bys1_generate(self.info)
					aiinput = self.auto_input.bys1_input[0]
					print("bys1 aiinput",aiinput)
					self.clear_info()

				if AI_type['beta']:
					#Using beta recursion
					self.auto_input.beta_generate(self.info,beta_step)
					aiinput = self.auto_input.beta_input
					self.clear_info()

				if AI_type['bys1nbeta']:
					#Using bys1 and beta
					self.auto_input.combine_bys1_beta(self.info,beta_step)
					aiinput = self.auto_input.bys1_beta_input
					self.clear_info()

				if AI_type['NN1']:
					self.logicNN.gener_input1(self.auto_input)
					if train_Model['NN1']:
						self.logicNN.gener_answer1(aiinput)
						if critical_train['NN1']:
							self.logicNN.critran_NN1()
						else:
							self.logicNN.trainNN1()
					nn1_inp = np.argmax(self.logicNN.predNN1())
					print("nn1_inp", nn1_inp)
					if test_Model['NN1']:
						print("testing")
						aiinput = nn1_inp

				if AI_type['NN2']:
					self.logicNN.gener_input1(self.auto_input)
					if train_Model['NN2']:
						self.logicNN.gener_answer1(aiinput)
						if critical_train['NN2']:
							self.logicNN.critran_NN2()
						else:
							self.logicNN.trainNN2()
					nn2_inp = np.argmax(self.logicNN.predNN2())
					print("nn2_inp", nn2_inp)
					if test_Model['NN2']:
						print("testing")
						aiinput = nn2_inp


				if (aiinput == 0):
					self.player.moveRight()

				if (aiinput == 1):
					self.player.moveLeft()

				if (aiinput == 2):
					self.player.moveUp()

				if (aiinput == 3):
					self.player.moveDown()

			elif(not using_AI):
				if (keys[K_RIGHT]):
					self.player.moveRight()

				if (keys[K_LEFT]):
					self.player.moveLeft()

				if (keys[K_UP]):
					self.player.moveUp()

				if (keys[K_DOWN]):
					self.player.moveDown()

			#K key to close the game
			if (keys[K_ESCAPE]):
				self._running = False

			#P to pause
			if(keys[K_p]):
				self.pause_flag = True
				self.pause_game()

			#S key to save the network
			if(keys[K_s]):
				if AI_type['NN1'] and train_Model['NN1']:
					self.logicNN.save_model1()
				if AI_type['NN2'] and train_Model['NN2']:
					self.logicNN.save_model2()
				if Vision_type['NN1'] and train_VModel['NN1']:
					self.visionNN.save_model1()
				if Vision_type['NN2'] and train_VModel['NN2']:
					self.visionNN.save_model2()

			#G for screen shot
			if(keys[K_g]):

				time1 = datetime.datetime.now()

				rect = pygame.Rect(0, 0, 800, 600)
				sub = self._display_surf.subsurface(rect)

				#first
				# pygame.image.save(sub, "../../screen_cap/sc_"+str(time1)+".jpeg")

				#second
				# block_list = self.gener_inp_vmodel1()
				# x = 0
				# y = 0
				# crit_iter = 0
				# for block in block_list:
				# 	out = self.gener_out_vmodel1((x, y))
				# 	if out[0, 3] == 0:
				# 		# print("out",out)
				# 		crit_iter += 1
				#
				# 		im = Image.fromarray(block,'L')
				# 		im.save("../../screen_cap/ob"+str(crit_iter)+str(time1)+".jpeg")
				# 	y += 1
				# 	if y > 14:
				# 		x += 1
				# 		y = 0

				#third
				# img_test = self.gener_inp_vmodel2()
				# temp_img = Image.fromarray(img_test, 'L')
				# temp_img.save("../../screen_cap/small"+str(time1)+".jpeg","JPEG")

				print("Image saved!!!!!!!!!!!!!!!!!!!!!!!!!")


			if(self.dead_pause_flag):
				self.dead_pause()

			self.on_loop()
			self.on_render()

			if GameRecord:
				time2 = datetime.datetime.now()
				self.screen_cap("sc_"+str(time2))

			time.sleep(sleep_time / 1000.0);

		self.on_cleanup()

	def pause_game(self):
		while(self.pause_flag):
			time.sleep(self.pause_loop_time / 1000.0);
			pygame.event.pump()
			keys = pygame.key.get_pressed()
			if(keys[K_p]):
				self.pause_flag = False

	def dead_pause(self):
		while(self.dead_pause_flag):
			time.sleep(self.pause_loop_time / 1000.0);

			pygame.event.pump()
			keys = pygame.key.get_pressed()

			#R to restart the game
			if(keys[K_r]):
				self.dead_pause_flag = False

			# Using random generation
			# self.auto_input.generate_input()
			# aiinput = self.auto_input.input

			if AI_type['bys1'] or AI_type['bys1nbeta']:
				#Using bayesian1
				self.generate_info()
				self.auto_input.bys1_generate(self.info)
				aiinput = self.auto_input.bys1_input[0]
				self.clear_info()
				if(aiinput == 4):
					self.dead_pause_flag = False

		self.reset()

	def reset(self):
		self.player.reset_player(self.player_init_length,self.player_init[0],\
		                         self.player_init[1])
		self.apple.reset_apple(self.apple_init[0],self.apple_init[1])

	def generate_info(self):
		self.info['apple'] = (self.apple.x, self.apple.y)
		self.info['wall'] = self.enemy.enemy
		self.info['dead'] = self.dead_pause_flag
		self.info['player'] = self.player

	def clear_info(self):
		self.info = {}

	def gener_inp_vmodel1(self):
		rect = pygame.Rect(0, 0, 800, 600)
		sub = self._display_surf.subsurface(rect)
		scrpix = np.zeros((40, 40), dtype=np.uint8)
		block_list = []

		for i in range(0, 800, 40):
			for j in range(0, 600, 40):
				for x in range(i, i + 40):
					for y in range(j, j + 40):
						rgb = sub.get_at((x, y))
						gray = 0.299 * rgb.r + 0.587 * rgb.g + \
						       0.114 * rgb.b
						if (gray >= 255):
							gray = 255
						scrpix[x - i, y - j] = gray
				block_list.append(np.copy(scrpix))

		return block_list

	#[player_tail,player,food,empty]
	def gener_out_vmodel1(self,posi):
		x,y = posi
		if self.player.x[0] == x and self.player.y[0] == y:
			return np.array([[0,1,0,0]])
		if self.apple.x == x and self.apple.y == y:
			return np.array([[0,0,1,0]])
		for i in range(1,self.player.max_length):
			if self.player.x[i] == x and self.player.y[i] == y:
				return np.array([[1,0,0,0]])
		return np.array([[0,0,0,1]])

	def gener_inp_vmodel2(self):
		rect = pygame.Rect(0, 0, 800, 600)
		sub = self._display_surf.subsurface(rect)
		image1 = np.zeros((400,300),dtype=np.uint8)

		for i in range(0,800,2):
			for j in range(0,600,2):
				rgb = sub.get_at((i,j))
				gray = 0.299 * rgb.r + 0.587 * rgb.g + \
				       0.114 * rgb.b
				if (gray >= 255):
					gray = 255
				image1[i//2,j//2] = gray
		temp_img = Image.fromarray(image1.T, 'L')
		temp_img.thumbnail(inp_size2, Image.ANTIALIAS)
		temp_array = np.array(temp_img,dtype=np.float32)
		temp_array = temp_array / 255
		return temp_array.T

		# return image1

	#[PHx,PHy,APx,APy]
	def gener_out_vmodel2(self):
		out = np.zeros((1,4))
		out[0,0] = self.player.x[0]
		out[0,1] = self.player.y[0]
		out[0,2] = self.apple.x
		out[0,3] = self.apple.y
		return out

	def screen_cap(self,filename):
		rect = pygame.Rect(0, 0, 800, 600)
		sub = self._display_surf.subsurface(rect)

		##first
		pygame.image.save(sub, self.path+"/"+filename)


if __name__ == "__main__":
	theApp = App()
	theApp.on_execute()

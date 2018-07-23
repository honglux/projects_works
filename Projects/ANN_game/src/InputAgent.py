import random

import pgmpy.models.BayesianModel as bysmodel
from pgmpy.factors.discrete import TabularCPD as tcpd
from pgmpy.inference import VariableElimination

class InputAgent:

	def __init__(self,k_output):
		self.VEbysmodel1 = 0
		self.input = 0
		self.info1 = {}
		self.bys1_input = 0
		self.keyarray = k_output
		self.beta_input = 0
		self.beta_input_list = []
		self.bys1_beta_input = 0

	def generate_input(self):
		self.input = random.randint(0, 4)
		print("input ",self.input)

	def bys1_init(self):
		bysmodel1 = bysmodel([('ED', 'MD'), ('AD', 'MD'), \
		                      ('EU', 'MU'), ('AU', 'MU'), \
		                      ('ER', 'MR'), ('AR', 'MR'), \
		                      ('EL', 'ML'), ('AL', 'ML'), \
		                      ('END', 'PR')])

		EU = tcpd(variable='EU', variable_card=2, \
		          values=[[0.01, 0.99]])
		ED = tcpd(variable='ED', variable_card=2, \
		          values=[[0.01, 0.99]])
		EL = tcpd(variable='EL', variable_card=2, \
		          values=[[0.01, 0.99]])
		ER = tcpd(variable='ER', variable_card=2, \
		          values=[[0.01, 0.99]])
		AU = tcpd(variable='AU', variable_card=2, \
		          values=[[0.01, 0.99]])
		AD = tcpd(variable='AD', variable_card=2, \
		          values=[[0.01, 0.99]])
		AL = tcpd(variable='AL', variable_card=2, \
		          values=[[0.01, 0.99]])
		AR = tcpd(variable='AR', variable_card=2, \
		          values=[[0.01, 0.99]])
		MD = tcpd(variable='MD', variable_card=2, \
		          evidence=['ED', 'AD'], evidence_card=[2, 2],\
		          values=[[0.75, 0.4, 0.9, 0.9],[0.25, 0.6, 0.1, 0.1]])
		MU = tcpd(variable='MU', variable_card=2, \
		          evidence=['EU', 'AU'], evidence_card=[2, 2], \
		          values=[[0.75, 0.4, 0.9, 0.9],[0.25, 0.6, 0.1, 0.1]])
		ML = tcpd(variable='ML', variable_card=2, \
		          evidence=['EL', 'AL'], evidence_card=[2, 2], \
		          values=[[0.75, 0.4, 0.9, 0.9], [0.25, 0.6, 0.1, 0.1]])
		MR = tcpd(variable='MR', variable_card=2, \
		          evidence=['ER', 'AR'], evidence_card=[2, 2], \
		          values=[[0.75, 0.4, 0.9, 0.9], [0.25, 0.6, 0.1, 0.1]])
		END = tcpd(variable='END', variable_card=2, \
		           values=[[0.01, 0.99]])
		PR = tcpd(variable='PR', variable_card=2, evidence=['END'], \
		          evidence_card=[2], values=[[1.0, 0.0], [0.0, 1.0]])

		bysmodel1.add_cpds(EU, ED, EL, ER, AU, AD, AL, AR, \
		                   MD, MU, ML, MR, END, PR)

		self.VEbysmodel1 = VariableElimination(bysmodel1)

	def bys1_generate(self,info):
		self.reset_info()
		self.condition_cal(info)

		VEbys1_query = self.VEbysmodel1.query(['MD', 'MU', 'ML', 'MR', 'PR'], \
								evidence=self.info1)
		max_p = -1.0
		max_p2 = -1.0
		target_move = ''
		target_move2 = ''
		counter = 0
		for key in VEbys1_query.keys():
			tempv = VEbys1_query[key].values[1]
			if counter == 0:
				if max_p < tempv:
					max_p = tempv
					target_move = key
			else:
				if max_p < tempv:
					max_p2 = max_p
					target_move2 = target_move
					max_p = tempv
					target_move = key
				elif max_p2 < tempv:
					max_p2 = tempv
					target_move2 = key

			counter += 1

		print(target_move,target_move2,max_p,max_p2)

		self.bys1_input = (self.keyarray.index(target_move),self.keyarray.index(target_move2))


	def condition_cal(self,info):
		player_cord, apple_cord, enemy_array = self.info_generate(info)

		if player_cord[0] < apple_cord[0]:
			self.info1['AR'] = 1
		if player_cord[0] > apple_cord[0]:
			self.info1['AL'] = 1
		if player_cord[1] < apple_cord[1]:
			self.info1['AD'] = 1
		if player_cord[1] > apple_cord[1]:
			self.info1['AU'] = 1

		for enemy in enemy_array:
			if (player_cord[0] == enemy[0]-1) and (player_cord[1] == enemy[1]):
				self.info1['ER'] = 1
			if (player_cord[0] == enemy[0]+1) and (player_cord[1] == enemy[1]):
				self.info1['EL'] = 1
			if (player_cord[1] == enemy[1]-1) and (player_cord[0] == enemy[0]):
				self.info1['ED'] = 1
			if (player_cord[1] == enemy[1]+1) and (player_cord[0] == enemy[0]):
				self.info1['EU'] = 1

		if info['dead']:
			self.info1['END'] = 1

	def reset_info(self):
		self.info1['EU'] = 0
		self.info1['ED'] = 0
		self.info1['ER'] = 0
		self.info1['EL'] = 0
		self.info1['AU'] = 0
		self.info1['AD'] = 0
		self.info1['AL'] = 0
		self.info1['AR'] = 0
		self.info1['END'] = 0

	def info_generate(self,info):
		enemy_array = []
		player = info['player']
		player_cord = (player.x[0],player.y[0])
		for i in range(1,player.length):
			enemy_array.append((player.x[i],player.y[i]))
		for wall in info['wall']:
			enemy_array.append(wall)
		apple_cord = info['apple']

		return (player_cord,apple_cord,enemy_array)

	def info_generate_withp(self,info):
		return (self.info_generate(info),info['player'])

	def beta_generate(self,info,steps):
		self.beta_input_list.clear()

		temp_info = info.copy()
		right_score = self.beta_recursion(temp_info, steps, 0)
		left_score = self.beta_recursion(temp_info, steps, 1)
		up_score = self.beta_recursion(temp_info, steps, 2)
		down_score = self.beta_recursion(temp_info, steps, 3)

		diff = 2
		score_lsit = []
		score_lsit.append(right_score)
		score_lsit.append(left_score)
		score_lsit.append(up_score)
		score_lsit.append(down_score)

		max = -65525
		counter = 0
		target = 0
		for score in score_lsit:
			if score > max:
				max = score
				target = counter
			counter += 1

		self.beta_input = target

		counter = 0
		for score in score_lsit:
			print(score,end="")
			if abs(max-score) <= diff:
				self.beta_input_list.append(counter)
			counter += 1

		print(self.beta_input_list)

	def beta_recursion(self,info,steps,player_move):
		(player_cord, apple_cord, enemy_array), player = self.info_generate_withp(info)
		total_score = 0
		for enemy in enemy_array:
			if self.isCollission(player_cord, enemy):
				return -40
		if self.isCollission(player_cord, apple_cord):
			total_score += 40
		if steps == 0:
			return total_score+20
		else:
			steps -= 1
			player_copy = player.copyself()
			up_score = 0
			down_score = 0
			left_score = 0
			right_score = 0
			if player_move == 0:
				if player_copy.direction != 1:
					player_copy.moveRight()
				else:
					return -40
			elif player_move == 1:
				if player_copy.direction != 0:
					player_copy.moveLeft()
				else:
					return -40
			elif player_move == 2:
				if player_copy.direction != 3:
					player_copy.moveUp()
				else:
					return -40
			elif player_move == 3:
				if player_copy.direction != 2:
					player_copy.moveDown()
				else:
					return -40

			player_copy.update()
			temp_info = info.copy()
			temp_info['player'] = player_copy
			right_score = self.beta_recursion(temp_info, steps, 0)
			left_score = self.beta_recursion(temp_info, steps, 1)
			up_score = self.beta_recursion(temp_info, steps, 2)
			down_score = self.beta_recursion(temp_info, steps, 3)

			total_score += ((right_score+left_score+up_score+down_score)//4)

			return total_score

	def isCollission(self,cord1,cord2):
		if cord1[0] == cord2[0]:
			if cord1[1] == cord2[1]:
				return True
		return False

	def combine_bys1_beta(self,info,steps):
		self.bys1_generate(info)
		self.beta_generate(info,steps)

		if (self.bys1_input[0] in self.beta_input_list):
			self.bys1_beta_input = self.bys1_input[0]
		elif (self.bys1_input[1] in self.beta_input_list):
			self.bys1_beta_input = self.bys1_input[1]
		else:
			self.bys1_beta_input = self.beta_input
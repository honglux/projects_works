import keras
from keras.models import Sequential
from keras.layers import Dense
import numpy as np
from keras.models import load_model
from keras import backend as K


NNmodel_input1 = ['ED','EU','ER','EL','AD','AU','AR','AL']

class LogicNN:


	def __init__(self,k_output):
		self.model = 0
		self.model2 = 0
		self.model3 = 0
		self.input1 = 0
		self.answer1 = 0
		self.NNmodel_output1 = k_output[:-1]

	def init_model1(self,inner1 = 16,inner2 = 16,inner3 = 16):
		print("init model1!!!!!!!!!!!!!!!!!!!!!")
		self.input1 = np.zeros((1,len(NNmodel_input1)),dtype=np.float32)
		self.answer1 = np.zeros((1,len(self.NNmodel_output1)),dtype=np.float32)

		self.model = Sequential()

		self.model.add(Dense(inner1,input_shape=(len(NNmodel_input1),)))

		self.model.add(Dense(inner2,activation='relu'))

		self.model.add(Dense(inner3))

		self.model.add(Dense(4,activation='softmax'))

		self.model.compile(loss=keras.losses.categorical_crossentropy,\
		              optimizer=keras.optimizers.Adadelta(),\
		              # metrics=['accuracy']\
		                   )

	def init_model2(self,inner1 = 16):
		print("init model2!!!!!!!!!!!!!!!!!!!!!!!!!!")

		self.input1 = np.zeros((1,len(NNmodel_input1)),dtype=np.float32)
		self.answer1 = np.zeros((1,len(self.NNmodel_output1)),dtype=np.float32)

		self.model2 = Sequential()
		self.model2.add(Dense(inner1, input_shape=(len(NNmodel_input1),),\
		                      activation=K.tanh))
		self.model2.add(Dense(4, activation='softmax'))

		self.model2.compile(loss=keras.losses.categorical_crossentropy,\
		              optimizer=keras.optimizers.Adadelta(),\
		              # metrics=['accuracy']\
		                   )

	def check_cirt(self,n=4):
		crit_flag = False
		for i in range(0, n):
			if self.input1[0, i] == 1:
				if crit_flag == False:
					crit_flag = True
					continue
				else:
					return True
		return False

	def trainNN1(self):
		self.model.fit(self.input1, self.answer1, \
		               batch_size=1, epochs=1, verbose=2)

	def critran_NN1(self,n=4):
		if self.check_cirt(n):
			self.trainNN1()


	def trainNN2(self):
		self.model2.fit(self.input1, self.answer1, \
		               batch_size=1, epochs=1, verbose=2)

	def critran_NN2(self,n=4):
		if self.check_cirt(n):
			self.trainNN2()

	def gener_answer1(self,ans):
		if ans == 4:
			self.answer1[0, 0] = 1.0
			return
		self.answer1 = np.zeros((1,len(self.NNmodel_output1)),dtype=np.float32)
		self.answer1[0,ans] = 1.0

	def predNN1(self):
		return self.model.predict(self.input1)

	def predNN2(self):
		return self.model2.predict(self.input1)

	def save_model1(self):
		self.model.save('NN1t1.h5')
		print("saved!!!!!!!!!!!!!!!!!!!!!!!!!!!!")

	def read_model1(self):
		self.model = load_model('NN1t1.h5')
		print("loaded!!!!!!!!!!!!!!!!!!!!!!!!!!!")

	def save_model2(self):
		self.model2.save('NN2t1.h5')
		print("saved!!!!!!!!!!!!!!!!!!!!!!!!!!!!")

	def read_model2(self):
		self.model2 = load_model('NN2t1.h5')
		print("loaded!!!!!!!!!!!!!!!!!!!!!!!!!!!")

	def gener_input1(self,inp_test):
		self.input1 = np.zeros((1, len(NNmodel_input1)), dtype=np.float32)
		iter = 0
		for condition in NNmodel_input1:
			cod = inp_test.info1[condition]
			self.input1[0,iter] = float(cod)
			iter += 1
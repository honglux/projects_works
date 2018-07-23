import keras
from keras.models import Sequential
from keras.layers import Dense, Flatten, Conv2D, MaxPooling2D
import numpy as np
from keras.models import load_model

input1_size = 40*40
output1_size = 4

clusize1 = 300

output2_size = 4

class VisionNN:

	def __init__(self):

		self.model1 = 0
		self.input1 = 0
		self.output1 = 0

		self.model2 = 0
		self.input2 = 0
		self.output2 = 0
		self.inp_size2 = 0


	def init_model1(self,inner1=800,activation1='sigmoid',inner2=400):
		print("init vision model1!!!!!!!!!!!!!!")
		self.input1 = np.zeros((clusize1,input1_size),dtype=np.uint8)
		self.output1 = np.zeros((clusize1,output1_size),dtype=int)

		self.model1 = Sequential()

		self.model1.add(Dense(inner1, input_shape=(input1_size,)\
		                     ,activation=activation1))

		self.model1.add(Dense(inner2))

		self.model1.add(Dense(4, activation='softmax'))

		self.model1.compile(loss=keras.losses.categorical_crossentropy,\
		              optimizer=keras.optimizers.Adadelta())

	def gener_input1(self,input):
		self.input1 = input

	def gener_output1(self,output):
		self.output1 = output

	def gener_ioput(self,input,output):
		self.gener_input1(input)
		self.gener_output1(output)

	def trainNN1(self):
		self.model1.fit(self.input1, self.output1, \
		               batch_size=10, epochs=1, verbose=2)

	def crit_trainNN1(self,size,input,output):
		tinput = input[0:size,:]
		toutput = output[0:size,:]
		self.model1.fit(tinput, toutput, \
		               batch_size=1, epochs=1, verbose=2)

	def predNN1(self,inp):
		return self.model1.predict(inp)

	def save_model1(self):
		self.model1.save('VINN1t1.h5')
		print("saved!!!!!!!!!!!!!!!!!!!!!!!!!!!!")

	def read_model1(self):
		self.model1 = load_model('VINN1t1.h5')
		print("loaded!!!!!!!!!!!!!!!!!!!!!!!!!!!")

	def init_model2(self,inp_size2,c_kernal=(8,8),p_size=(4,4),inner1=1200,\
	                activation1='sigmoid',\
	                inner2=300,activation2='sigmoid'):
		print("init vision model2!!!!!!!!!!!!!!")

		self.inp_size2 = inp_size2
		inp_w, inp_h = inp_size2
		input2_shape = (1,inp_w,inp_h)

		self.model2 = Sequential()

		self.model2.add(Conv2D(16, kernel_size=c_kernal,
		                 activation='relu',
		                 input_shape=input2_shape,data_format="channels_first"))

		self.model2.add(MaxPooling2D(pool_size=p_size))

		self.model2.add(Flatten())

		self.model2.add(Dense(inner1, activation=activation1))

		self.model2.add(Dense(inner2, activation=activation2))

		self.model2.add(Dense(output2_size))

		self.model2.compile(\
						loss=keras.losses.mean_squared_error, \
						# loss=keras.losses.poisson,\
		                optimizer=keras.optimizers.Adadelta())

	def gener_input2(self,input):
		self.input2 = input

	def gener_output2(self,output):
		self.output2 = output

	def gener_iopu2(self,input,output):
		self.gener_input2(input)
		self.gener_output2(output)

	def trainNN2(self):
		# print("input,output",self.input2,self.output2)
		self.model2.fit(self.input2, self.output2, \
		               batch_size=1, epochs=1, verbose=2)

	def predNN2(self,inp):
		return self.model2.predict(inp)

	def save_model2(self):
		self.model2.save('VINN2t1.h5')
		print("saved!!!!!!!!!!!!!!!!!!!!!!!!!!!!")

	def read_model2(self):
		self.model2 = load_model('VINN2t1.h5')
		print("loaded!!!!!!!!!!!!!!!!!!!!!!!!!!!")
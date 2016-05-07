"""
name:2a_Jumbler
use dict.txt to search a word which is scrambled

CIS 210 lab 2; 2013 fall

authors Honglu Xu
"""

import sys
while True:
	#word=sys.argv[1]	#get the input word
	word = raw_input("Input a word: ")

	wor_sor=sorted(word)	#sort the word
	wor_sor_str=''.join(wor_sor)	#change back to str

	#dict=open(sys.argv[2])	#open the file for the dictionary
	dict=open("dict.txt")

	i=0	#as a counter
	j=0	#as a counter
	for line in dict:
		i=i+1	

		line = line.rstrip('\n')	#remove the '\n'
		lin_sor=sorted(line)	#sort the line
		lin_sor_str=''.join(lin_sor)	#change back to str

		if wor_sor_str==lin_sor_str:	#do compare
	#		print("1")
			print(line)
			j=j+1
	print(j," matches from ",i," words")
	print 
	
	if (raw_input("Enter 'e' to exit, anything else to continue: ") == 'e'):
		break
	print
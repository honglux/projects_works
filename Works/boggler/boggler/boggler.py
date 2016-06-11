
"""
Boggle solver.
	Usage:  python3 boggler.py  "board" dict.txt
	where "board" is 16 characters of board, in left-to-right reading order
	and dict.txt can be any file containing a list of words in alphabetical order
	
	Authors:Honglu Xu
	
"""

from boggle_board import BoggleBoard   
import argparse   # Command line processing
import game_dict  # Dictionary of legal game words

def main():
	"""
	Main program: 
	Find all words of length 3 or greater on a boggle 
	board. 
	Args:
		none (but expect two arguments on command line)
	Returns: 
		Nothing (but prints found words in alphabetical
		order, without duplicates, one word per line)
	"""
	#dict_file, board_text = getargs()
	dict_file = "dict.txt"
	try:
		dict_f = open(dict_file,'r')
	except:
		print("dictionary file error")
		input()
		exit(1)
		
	game_dict.read( dict_f )
		
	while True:
		board_text = input("Please enter the board text(16 charaters): ")
		if not len(board_text) == 16:
			print("Please make sure there are 16 charaters!")
			input()
			continue
		
		board = BoggleBoard(board_text)
		results = [ ] 
		i=0	#as a counter to calculate the row and col
		for letter in board_text:	#search one letter by one letter
			find_words(board,(i//4),(i%4),letter, results)	#call the function
			i+=1
		results=sorted(results)	#sort the results
		sco=0	#as a sum of the score
		for elem in results:
			#if score(elem) >= 1:
			print(elem,score(elem))	#Print each word and its score
			sco+=score(elem)	#calculate the sum score
		print("Total score: ",sco)	#print the total score
		if input("Enter 'e' to exit, anything else to continue: ") == 'e':
			break

'''
def getargs():
	"""
	Get command line arguments.
	Args:
	   none (but expects two arguments on program command line)
	Returns:
	   pair (dictfile, text)
		 where dictfile is a file containing dictionary words (the words boggler will look for)
		 and   text is 16 characters of text that form a board
	Effects:
	   also prints meaningful error messages when the command line does not have the right arguments
   """
	parser = argparse.ArgumentParser(description="Find boggle words")
	parser.add_argument('board', type=str, help="A 16 character string to represent 4 rows of 4 letters. Q represents QU.")
	parser.add_argument('dict', type=argparse.FileType('r'),
						help="A text file containing dictionary words, one word per line.")
	args = parser.parse_args()  # will get arguments from command line and validate them
	text = args.board
	dictfile = args.dict
	if len(text) != 16 :
		print("Board text must be exactly 16 alphabetic characters")
		exit(1)
	return dictfile, text
'''

		
def find_words(board, row, col, prefix, results):
	"""Find all words starting with prefix that
	can be completed from row,col of board.
	Args:
		row:  row of position to continue from (need not be on board)
		col:  col of position to continue from (need not be on board)
		prefix: looking for words that start with this prefix
		results: list of words found so far
	Returns: nothing
		(side effect is filling results list)
	Effects:
		inserts found words (not necessarily unique) into results
	"""
	#print(prefix)
	board.mark_taken(row, col)	#mark the letter we are using
	if row < 0 or row >= len(board.content) or col < 0 or col >= len(board.content[0]):	#see if out of board
		return
	#print(game_dict.search(prefix))
	if game_dict.search(prefix)==0:	#NO_MATCH
		board.unmark_taken( row, col)	#return and unmark the letter
		return
	elif game_dict.search(prefix)==1:	#find the word successfully
		if prefix not in results:	#see if we have already found it
			results.append(prefix)	#put the word into results
	if board.available( row+1, col):	#check the letter under this letter
		find_words(board, row+1, col, prefix+board.get_char(row+1,col),results)
	if board.available( row, col+1):	#check the letter on the right of this letter
		find_words(board, row, col+1, prefix+board.get_char(row,col+1),results)
	if board.available( row-1, col):	#check the letter above this letter
		find_words(board, row-1, col, prefix+board.get_char(row-1,col),results)
	if board.available( row, col-1):	#check the letter on the left of this letter
		find_words(board, row, col-1, prefix+board.get_char(row,col-1),results)
	if board.available( row+1, col+1):	#check the letter on the low right of this letter
		find_words(board, row+1, col+1, prefix+board.get_char(row+1,col+1),results)
	if board.available( row+1, col-1):	#check the letter on the low left of this letter
		find_words(board, row+1, col-1, prefix+board.get_char(row+1,col-1),results)
	if board.available( row-1, col+1):	#check the letter on the up right of this letter
		find_words(board, row-1, col+1, prefix+board.get_char(row-1,col+1),results)
	if board.available(row-1, col-1):	#check the letter on the up left of this letter
		find_words(board, row-1, col-1, prefix+board.get_char(row-1,col-1),results)
	board.unmark_taken( row, col)	#if there's nothing can do,unmark and return
	return	
	
def score(word):
	"""
	Compute the Boggle score for a word, based on the scoring table
	at http://en.wikipedia.org/wiki/Boggle. 
	Word length	Points
		3, 4	1
		5		2
		6		3
		7		5
		8+		11
	 """
	if len(word)>=3 and len(word)<=4:
		return 1
	elif len(word)==5:
		return 2
	elif len(word)==6:
		return 3
	elif len(word)==7:
		return 5
	elif len(word)>=8:
		return 11
	return 0



####
# Run if invoked from command line
####

if __name__ == "__main__":
	main()
	input("Press enter to end")

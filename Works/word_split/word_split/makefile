c_h_file = main.cpp iterative.h print_it.h print_re.h recursion.h search.h

all:word_split

word_split:main.o
	g++ main.o -o word_split.out

main.o:$(c_h_file)
	g++ -c main.cpp

clean:
	rm -f *.o
	rm -f word_split.out

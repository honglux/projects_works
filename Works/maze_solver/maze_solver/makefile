c_h_file = main.cpp maze.hpp utils.hpp
std = -std=c++11

all: maze_solver

maze_solver: main.o
	g++ $(std) -o maze_solver.out main.o maze.o utils.o

main.o:$(c_h_file)
	g++ $(std) -c main.cpp maze.cpp utils.cpp

clean:
	rm -f *.o
	rm -f maze_solver.out

/*
 * maze.hpp
 *      Author: norris,Honglu
 */


#ifndef MAZE_HPP_
#define MAZE_HPP_

#include <fstream>

#define Max_Size 30

class Maze
{
public:
	Maze(int size);
	~Maze() {}

	enum Direction { DOWN, RIGHT, UP, LEFT };

	// Implement the following functions:

	// read maze from file, find starting location
	void readFromFile(std::ifstream &f);

	// make a single step advancing toward the exit
	void step();

	// return true if the maze exit has been reached, false otherwise
	bool atExit();

	// set row and col to current position of 'x'
	void getCurrentPosition(int &row, int &col);

	int get_dir();
	// You can add more functions if you like
private:
	// Private data and methods 
	char maz_mat[Max_Size][Max_Size];
	int size;
	int sta_dir;
	int sta_x, sta_y;
};


#endif /* MAZE_HPP_ */

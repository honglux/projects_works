#include<iostream>
#include<fstream>
#include<string>
#include "maze.hpp"

using namespace std;

Maze::Maze(int size) :size(size){ cout << "constructor;" << endl; }

void Maze::readFromFile(std::ifstream &f)
{
	//cout << "read from file!" << endl;
	string line;
	for (int i = 0; i < size; i++)
	{
		f >> line;
		//cout << "line: " << line<<endl;
		for (int j = 0; j < size; j++)
		{
			//cout << "line: " << j << ": " << line[j]<<endl;
			if (line[j] == 'x')
			{
				sta_x = j;
				sta_y = i;
				if (i == 0)
				{
					sta_dir = DOWN;
				}
				else if (i == size-1)
				{
					sta_dir = UP;
				}
				else if (j == 0)
				{
					sta_dir = RIGHT;
				}
				else if (j == size - 1)
				{
					sta_dir = LEFT;
				}
				else
				{
					cout << "Error: wrong start position." << endl;
				}
				//cout << "sta_dir " << sta_dir <<endl;
			}
			maz_mat[i][j] = line[j];
		}
	}
}

void Maze::step()
{
	if (maz_mat[sta_y][sta_x] == '@')
	{
		cout << "error location!" << endl;
	}
	switch (sta_dir)
	{
	case DOWN:
	{
				 if (maz_mat[sta_y][sta_x - 1] != '@')
				 {
					 sta_dir = LEFT;
					 sta_x--;
					 //cout << "DOWN-LEFT" << endl;
				 }
				 else if (maz_mat[sta_y + 1][sta_x] != '@')
				 {
					 sta_y++;
					 //cout << "DOWN-DOWN" << endl;
				 }
				 else if (maz_mat[sta_y][sta_x + 1] != '@')
				 {
					 sta_dir = RIGHT;
					 sta_x++;
					 //cout << "DOWN-RIGHT" << endl;
				 }
				 else
				 {
					 sta_dir = UP;
					 sta_y--;
					//cout << "DOWN-UP" << endl;
				 }
				 break;
	}
	case RIGHT:
	{
				 if (maz_mat[sta_y+1][sta_x] != '@')
				 {
					 sta_dir = DOWN;
					 sta_y++;
					  //cout << "RIGHT-DOWN" << endl;
				 }
				 else if (maz_mat[sta_y][sta_x+1] != '@')
				 {
					 sta_x++;
					// cout << "RIGHT-RIGHT" << endl;
				 }
				 else if (maz_mat[sta_y-1][sta_x] != '@')
				 {
					 sta_dir = UP;
					 sta_y--;
					// cout << "RIGHT-UP" << endl;
				 }
				 else
				 {
					 sta_dir = LEFT;
					 sta_x--;
					 //cout << "RIGHT-LEFT" << endl;
				 }
				 break;
	}
	case UP:
	{
				  if (maz_mat[sta_y][sta_x+1] != '@')
				  {
					  sta_dir = RIGHT;
					  sta_x++;
					 // cout << "UP-RIGHT" << endl;
				  }
				  else if (maz_mat[sta_y-1][sta_x] != '@')
				  {
					  sta_y--;
					  //cout << "UP-UP" << endl;
				  }
				  else if (maz_mat[sta_y][sta_x-1] != '@')
				  {
					  sta_dir = LEFT;
					  sta_x--;
					 // cout << "UP-RIGHT" << endl;
				  }
				  else
				  {
					  sta_dir = DOWN;
					  sta_y++;
				  }
				  break;
	}
	case LEFT:
	{
			   if (maz_mat[sta_y-1][sta_x] != '@')
			   {
				   sta_dir = UP;
				   sta_y--;
			   }
			   else if (maz_mat[sta_y][sta_x-1] != '@')
			   {
				   sta_x--;
			   }
			   else if (maz_mat[sta_y+1][sta_x] != '@')
			   {
				   sta_dir = DOWN;
				   sta_y++;
			   }
			   else
			   {
				   sta_dir = RIGHT;
				   sta_x++;
			   }
			   break;
	}
	}
}

bool Maze::atExit()
{
	if ((sta_x == 0 || sta_x == (size - 1) || sta_y == 0 || sta_y == (size - 1)) && (maz_mat[sta_y][sta_x]!='x'))
	{
		return true;
	}
	return false;
}

void Maze::getCurrentPosition(int &row,int &col)
{
	row = sta_y;
	col = sta_x;
}

int Maze::get_dir()
{
	return sta_dir;
}

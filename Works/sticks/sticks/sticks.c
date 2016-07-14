#include <stdio.h>
#include <stdlib.h>
#include <time.h>      
#include <string.h>
#include <limits.h>
#include <math.h>

#define take_num 5	//number of sticks that can be taken in one turn.
#define think_turn 3	//number of turns that the computer will predict. 

int dep_fir_AI(int, int, int, int);

int getHumanChoice() 
{
	int hum_cho;
	
	printf("Player 1: How many sticks do you take (1-%d)?: ",take_num);
	scanf("%d", &hum_cho);
	while (hum_cho > take_num || hum_cho < 1)
	{
		printf("Please enter a number between 1-%d.\n", take_num);
		printf("Player 1: How many sticks do you take (1-%d)?: ", take_num);
		while (getchar() != '\n'){}
		scanf("%d", &hum_cho);
	}
	return hum_cho;
}

int getComputerChoice(int current_sticks) {

	int result_list[take_num];
	for (int com_tak = 1; com_tak <= take_num; com_tak++)
	{
		result_list[com_tak - 1] = dep_fir_AI(current_sticks, take_num, think_turn, com_tak);
	}

	int Max = SHRT_MIN;
	int index = 0;
	for (int i = 0; i < take_num; i++)
	{
		//printf(" %d - %d \n", i, result_list[i]);
		if (result_list[i] > Max)
		{
			Max = result_list[i];
			index = i;
		}
	}
	if (Max == 0)
	{
		int rand_choice = rand() % take_num + 1;
		if (rand_choice > current_sticks) { return current_sticks; }
		return rand_choice;
	}
	return (index+1);
	
}


int main(int argc, char** argv) 
{
	while(1)
	{
		int human, computer, number_sticks;
		int flag=0;
		
		srand (time(NULL)); /* for reproducible results, you can call srand(1); */
		
		printf("Welcome to the game of sticks!\n");
		printf("How many sticks are there on the table initially (10-100)?: ");
		scanf("%d", &number_sticks);
		while (number_sticks<10 || number_sticks>100)
		{
			printf("Please enter a number between 10-100.\n");
			printf("How many sticks are there on the table initially (10-100)?: ");
			while (getchar() != '\n'){}
			scanf("%d", &number_sticks);
		}
		
		while (number_sticks > 0)
		{
			printf("There are %d sticks on the board.\n", number_sticks);
			switch (flag)
			{
			case 0:
			{
				human = getHumanChoice();
				number_sticks = number_sticks - human;
				if (number_sticks <= 0)
				{
					printf("You lose!\n");
					break;
				}
				flag = 1;
			}
			case 1:
			{
				computer = getComputerChoice(number_sticks);
				printf("Computer selects %d.\n", computer);
				number_sticks = number_sticks - computer;
				if (number_sticks <= 0)
				{
					printf("You win!\n");
					break;
				}
				flag = 0;
			}
			}

		}
		while (getchar() != '\n'){}
		char quit;
		printf("Enter 'e' to quit, anything else to continue: ");
		scanf("%c", &quit);
		//printf("quit - %c\n",quit);
		if(quit == 'e')
		{
			break;
		}
		//while (getchar() != '\n'){}
		printf("\n");
	}
    return 0;
}

int dep_fir_AI(int sti, int tak_num, int turn, int com_tak)
{
	turn--;
	if (turn < 1)
	{
		return 0;
	}
	else
	{
		if (sti <= 0)
		{
			return (pow(1,turn));
		}
		else
		{
			sti = sti - com_tak;
			if (sti <= 0)
			{
				return -(pow(2,turn));
			}
			else
			{
				int score = 0;
				for (int hum_tak = 1; hum_tak <= tak_num; hum_tak++)
				{
					int aft_hum_sti = sti - hum_tak;

					for (int com_take = 1; com_take <= tak_num; com_take++)
					{
						int sco_temp = dep_fir_AI(aft_hum_sti, tak_num, turn, com_take);
						score += sco_temp;
					}

				}
				return score;
			}
		}
	}

}

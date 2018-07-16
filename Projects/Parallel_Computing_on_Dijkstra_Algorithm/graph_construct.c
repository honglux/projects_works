#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>

// #define EPN 5

int main(int argc, char *argv[]) 
{
	printf("graph_construct.c\n");
	fflush(stdout);
	
	srand(time(NULL));
	
	const char* filename = malloc(sizeof(char)*100);
	int print_flag = 0;
	int size = 0;
	int EPN = 2;
	
	if(argc < 2)
	{
		printf("Not enough parameters!");
		return -1;
	}
	else
	{
		filename = argv[1];
		if(argc > 2)
		{
			size = (int)atoi(argv[2]);
		}
		if(argc > 3)
		{
			EPN = (int)atoi(argv[3]);
		}
		if((argc > 4) && (strcmp(argv[4],"p") == 0))
		{
			print_flag = 1;
		}
	}
	
	printf("filename %s\n",filename);
	
	FILE* file;
	
	file = (fopen(filename,"w"));
	
	// FILE *fopen( const char * filename, const char * mode );
	
	// edges = read_file()
	
	int i = 0;
	int j = 0;
	int weight = 0;
	char* line = malloc(sizeof(char)*30);
	char buff[10];
	
	int line_iter = 0;
	for(i = 0;i<size;i++)
	{
		for(j = i+1;j<(i+1+EPN);j++)
		{
			if(j>=size)
			{
				break;
			}
			line_iter++;
		}
	}
	line_iter++;
	snprintf(buff, sizeof(buff), "%d",line_iter);
	strcpy(line, buff);	//write the size;
	strcat(line, "\n");
	fputs(line, file);
	
	for(i = 0;i<size;i++)
	{
		for(j = i+1;j<(i+1+EPN);j++)
		{
			if(j>=size)
			{
				break;
			}
			else
			{
				weight = (int)(rand()%10);
				// printf("weight %d\n",weight);
				snprintf(buff, sizeof(buff), "%d",i);
				// printf("i %s\n",buff);
				strcpy(line, buff);
				strcat(line," ");
				snprintf(buff, sizeof(buff), "%d",j);
				strcat(line, buff);
				strcat(line, " ");
				snprintf(buff, sizeof(buff), "%d",weight);
				strcat(line, buff);
				strcat(line, "\n");
				if(print_flag)
				{
					printf("line %s",line);
				}
				fputs(line, file);
			}
		}
	}
	
	fclose(file);
	
	printf("finished\n");
	
	return 0;
}
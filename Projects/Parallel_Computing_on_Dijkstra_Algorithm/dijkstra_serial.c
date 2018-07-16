//Honglu Xu
//hxx171
//FP

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <sys/time.h>

struct Edge
{
	int source;
	int dest;
	int weight;
};

struct Edge dijs_serial(struct Edge* edges,int edgen,int destna,int print_flag);
int checkifinside(int* array, int target, int size);
int checkconnfsource(struct Edge* edges,int edgen,int source,int dest);
int init_array(int* array,int size);
int get_weight(struct Edge* edges,int edgen,int source,int dest);
void print_edges(struct Edge* edges, int edgen);
void print_array(int* array,int size);

int main(int argc, char *argv[]) 
{
	printf("dijkstra_serial.c\n");
	fflush(stdout);
	char* filename;
	int print_flag = 0;
	
	struct timeval start_time, stop_time;  // timers
	double consume_time;
	
	if(argc < 2)
	{
		printf("Not enough parameters!");
		return -1;
	}
	else
	{
		filename = argv[1];
		if((argc > 2) && (strcmp(argv[2],"p") == 0))
		{
			print_flag = 1;
		}
	}
	
	printf("filename %s\n",filename);
	
	FILE* file;
	
	file = fopen(filename,"r");
	
	if (file == NULL)
	{
		printf("filename error!\n");
		exit(EXIT_FAILURE);
	}
    
	int edgen = 0;
	int destna = 0;
	
	char* line = malloc(sizeof(char)*30);
	int ele_iter = 0;
	int line_iter = 0;
	char* buff;
	
	fgets(line, 30, file);
	edgen = (int)atoi(line);
	
	struct Edge* edges = (struct Edge*)malloc(sizeof(struct Edge)*edgen);
	
	edgen--;
	
	while(fgets(line, 30, file) != NULL)
	{
		ele_iter = 0;
		buff = strtok (line," ");
		edges[line_iter].source = (int)atoi(buff);
		while(buff != NULL)
		{
			ele_iter++;
			buff = strtok (NULL," ");
			if(ele_iter == 1)
			{
				edges[line_iter].dest = (int)atoi(buff);
			}
			else if(ele_iter == 2)
			{
				edges[line_iter].weight = (int)atoi(buff);
			}
			
		}
		line_iter++;
	}
	
	destna = edges[edgen-1].dest;
	
	struct Edge result_edge;
	
	gettimeofday(&start_time,NULL);
	result_edge = dijs_serial(edges,edgen,destna,print_flag);
	gettimeofday(&stop_time,NULL);
	consume_time = (double)(stop_time.tv_usec - start_time.tv_usec) / 1000000
		+ (double)(stop_time.tv_sec - start_time.tv_sec);
	
	printf("result: %d\n",result_edge.weight);
	printf("Size %d Thread 1 Sort Time %f\n",destna,consume_time);
	
	fclose(file);
	
	free(line);
	free(edges);
	
	return 0;
}

struct Edge dijs_serial(struct Edge* edges,int edgen,int destna,int print_flag)
{
	struct Edge temp_edge;
	int i,j;
	int* cluster = (int*)malloc(sizeof(int)*destna+1);
	init_array(cluster,destna+1);
	int cluster_size = 0;
	struct Edge* found_edges = malloc(sizeof(struct Edge)*edgen);
	int found_edge_size = 0;
	int* next_list = malloc(sizeof(int)*destna+1);
	int next_list_size = 0;
	init_array(next_list,destna+1);
	int min = 1000000;
	int temp_weight = 0;
	
	cluster[cluster_size] = 0;
	cluster_size++;
	
	while(!checkifinside(cluster,destna,cluster_size))
	{
		next_list_size = 0;
		init_array(next_list,destna+1);

		//check next avalable ndoes;
		for(i = 0;i<cluster_size;i++)
		{
			for(j = 0;j<=destna;j++)
			{
				if(checkconnfsource(edges,edgen,cluster[i],j) && !checkifinside(cluster,j,cluster_size)
					&& !checkifinside(next_list,j,next_list_size))
				{
					next_list[next_list_size] = j;
					next_list_size++;
				}
			}
		}

		//trace back;
		min = 1000000;
		for(i=0;i<next_list_size;i++)
		{
			if(next_list[i]<0)
			{
				printf("size error!\n");
				return temp_edge;
			}
			for(j=0;j<=destna;j++)
			{
				if(next_list[i] == j)
				{
					continue;
				}
				if(checkconnfsource(edges,edgen,j,next_list[i]) && checkifinside(cluster,j,cluster_size))
				{
					temp_weight = 0;
					temp_weight += get_weight(edges,edgen,j,next_list[i]);
					if(j!=0)
					{
						temp_weight += get_weight(found_edges,found_edge_size,0,j);
					}
					if(temp_weight < min)
					{
						min = temp_weight;
						temp_edge.source = 0;
						temp_edge.dest = next_list[i];
						temp_edge.weight = temp_weight;
					}
				}
			}
			
		}
		
		found_edges[found_edge_size] = temp_edge;
		found_edge_size++;
		cluster[cluster_size] = temp_edge.dest;
		cluster_size++;
		
	}
	if(print_flag)
	{
		printf("Cluster Array: ");
		print_array(cluster,cluster_size);
		printf("Found Edges: \n");
		print_edges(found_edges,found_edge_size);
	}
	
	printf("Total steps: %d\n",cluster_size);

	return temp_edge;
}

int checkifinside(int* array, int target, int size)
{
	int i;
	for(i = 0;i<size;i++)
	{
		if(target == array[i])
		{
			return 1;
		}
	}
	return 0;
}

//check connected from source to dest;
int checkconnfsource(struct Edge* edges,int edgen,int source,int dest)
{	
	int i;
	for(i=0;i<edgen;i++)
	{
		if(edges[i].source == source && edges[i].dest == dest)
		{
			return 1;
		}
	}
	return 0;
}

int init_array(int* array,int size)
{
	int i;
	for(i=0;i<size;i++)
	{
		array[i] = -1;
	}
}

int get_weight(struct Edge* edges,int edgen,int source,int dest)
{
	int i;
	for(i=0;i<edgen;i++)
	{
		if(edges[i].source == source && edges[i].dest == dest)
		{
			return edges[i].weight;
		}
	}
	printf("Can not find edges! %d %d\n",source,dest);
	return -1;
}

void print_edges(struct Edge* edges, int edgen)
{
	int i;
	for(i=0;i<edgen;i++)
	{
		printf("edge %d %d %d\n",edges[i].source,edges[i].dest,edges[i].weight);
	}

}

void print_array(int* array,int size)
{
	int i;
	printf(" array ");
	for(i=0;i<size;i++)
	{
		printf(" %d",array[i]);
	}
	printf("\n");

}
//Honglu Xu
//hxx171
//FP

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <sys/time.h>
#include <omp.h> 

struct Edge
{
	int source;
	int dest;
	int weight;
};

struct ArraySize
{
	int* array;
	int size;
};

struct Edge dijs_openmp(struct Edge* edges,int edgen,int destna,int print_flag,int nthreads);
int checkifinside(int* array, int target, int size);
int checkconnfsource(struct Edge* edges,int edgen,int source,int dest);
int init_array(int* array,int size);
int get_weight(struct Edge* edges,int edgen,int source,int dest);
void print_edges(struct Edge* edges, int edgen);
void print_array(int* array,int size);
struct ArraySize purge_array(int* array,int size);

struct timeval start_time1, stop_time1;  // timers
struct timeval start_time2, stop_time2;  // timers
double consume_time1,consume_time2;

int main(int argc, char *argv[]) 
{
	printf("dijkstra_openmp_para.c\n");
	fflush(stdout);
	char* filename;
	int print_flag = 0;
	int nthreads = 4;
	
	struct timeval start_time, stop_time;  // timers
	double consume_time;
	consume_time1 = 0.0;
	consume_time2 = 0.0;
	
	if(argc < 2)
	{
		printf("Not enough parameters!");
		return -1;
	}
	else
	{
		filename = argv[1];
		if((argc > 2))
		{
			nthreads = atoi(argv[2]);
		}
		if((argc > 3) && (strcmp(argv[3],"p") == 0))
		{
			print_flag = 1;
		}
	}
	
	printf("filename %s\n",filename);
	omp_set_num_threads(nthreads);
	
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
	
	fclose(file);
	
	destna = edges[edgen-1].dest;
	
	struct Edge result_edge;
	
	gettimeofday(&start_time,NULL);
	result_edge = dijs_openmp(edges,edgen,destna,print_flag,nthreads);
	gettimeofday(&stop_time,NULL);
	consume_time = (double)(stop_time.tv_usec - start_time.tv_usec) / 1000000
		+ (double)(stop_time.tv_sec - start_time.tv_sec);
	
	printf("result: %d\n",result_edge.weight);
	printf("Size %d Thread %d Total Time %f\n",destna,nthreads,consume_time);
	printf("Part1Time %f Part2Time %f\n",consume_time1,consume_time2);

	free(line);
	free(edges);
	
	return 0;
}

struct Edge dijs_openmp(struct Edge* edges,int edgen,int destna,int print_flag,int nthreads)
{
	//malloc memory for trace back one time number of edges;
	struct Edge* temp_edge_list = (struct Edge*)malloc(sizeof(struct Edge)*edgen);
	int temp_edli_size = 0;
	int i,j;
	int* cluster = (int*)malloc(sizeof(int)*(destna+1));
	init_array(cluster,destna+1);
	int cluster_size = 0;
	struct Edge* found_edges = malloc(sizeof(struct Edge)*edgen);
	int found_edge_size = 0;
	int next_list_max_size = (destna+1)*20+1;
	int* next_list = malloc(sizeof(int)*next_list_max_size);
	int next_list_size = 0;
	init_array(next_list,destna+1);
	int min = 1000000;
	
	cluster[cluster_size] = 0;
	cluster_size++;
	
	int end_flag = 0;
	
	
	
	while(!checkifinside(cluster,destna,cluster_size))
	{
		if(end_flag)
		{
			break;
		}
		next_list_size = 0;
		init_array(next_list,destna+1);
		
		//check next avalable ndoes;
		gettimeofday(&start_time1,NULL);
		
		int section = (int)(cluster_size/nthreads);
		
		#pragma omp parallel
		{
			int tid = omp_get_thread_num();
			int start = tid*section;
			int end;
			if(tid == nthreads-1)
			{
				end = cluster_size;
			}
			else
			{
				end =(tid+1)*section;
			}
			 
			
			int pi2;
			for(pi2 = start;pi2<end;pi2++)
			{
				int pj;
				for(pj = 0;pj<=destna;pj++)
				{
					if(checkconnfsource(edges,edgen,cluster[pi2],pj) && !checkifinside(cluster,pj,cluster_size)
						&& !checkifinside(next_list,pj,next_list_size)
						)
					{
						#pragma omp critical
						{
							next_list[next_list_size] = pj;
							next_list_size++;
						}
					}
				}
			}
		}
		struct ArraySize purg_as = purge_array(next_list,next_list_size);
		gettimeofday(&stop_time1,NULL);
		consume_time1 += (double)(stop_time1.tv_usec - start_time1.tv_usec) / 1000000
			+ (double)(stop_time1.tv_sec - start_time1.tv_sec);

		temp_edli_size = 0;
		
		int section2 = (int)(purg_as.size/nthreads);
		
		gettimeofday(&start_time2,NULL);
		#pragma omp parallel
		{
			int pi;
			
			int tid = omp_get_thread_num();
			int start = tid*section2;
			int end;
			if(tid == nthreads-1)
			{
				end = purg_as.size;
			}
			else
			{
				end =(tid+1)*section2;
			}
			
			for(pi=start;pi<end;pi++)
			{
				if(end_flag)
				{
					continue;
				}
				
				if(purg_as.array[pi]<0)
				{
					printf("Size error!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n");
					end_flag = 1;
					continue;
				}
				
				int pj2;
				for(pj2=0;pj2<=destna;pj2++)
				{
					if(purg_as.array[pi] == pj2)
					{
						continue;
					}
					
					
					
					if(checkconnfsource(edges,edgen,pj2,purg_as.array[pi]) 
						&& checkifinside(cluster,pj2,cluster_size))
					{
						
						int temp_weight = 0;
						temp_weight += get_weight(edges,edgen,pj2,purg_as.array[pi]);
						if(pj2!=0)
						{
							temp_weight += get_weight(found_edges,found_edge_size,0,pj2);
						}
					
						
						#pragma omp critical
						{
		
							
							temp_edge_list[temp_edli_size].source = 0;
							temp_edge_list[temp_edli_size].dest = purg_as.array[pi];
							temp_edge_list[temp_edli_size].weight = temp_weight;
						
							temp_edli_size++;
												
						}
					}
				}
			}
		}
		if(end_flag)
		{
			break;
		}
	
		min = 1000000;
		int mindex = 0;
		for(i=0;i<temp_edli_size;i++)
		{
			if(temp_edge_list[i].weight < min)
			{
				min = temp_edge_list[i].weight;
				mindex = i;
			}
		}
		gettimeofday(&stop_time2,NULL);
		consume_time2 += (double)(stop_time2.tv_usec - start_time2.tv_usec) / 1000000
			+ (double)(stop_time2.tv_sec - start_time2.tv_sec);
		
		
		
		
		found_edges[found_edge_size] = temp_edge_list[mindex];
		found_edge_size++;
		
		int temp_clust = temp_edge_list[mindex].dest;
		cluster[cluster_size] = temp_clust;
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

	return found_edges[found_edge_size-1];
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
	printf("Error! Can not find edges! %d %d\n",source,dest);
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

struct ArraySize purge_array(int* array,int size)
{
	struct ArraySize newas;
	newas.array = (int*)malloc(sizeof(int)*size);
	newas.size = 0;
	int i;
	for(i=0;i<size;i++)
	{
		if(!checkifinside(newas.array,array[i],newas.size))
		{
			newas.array[newas.size] = array[i];
			newas.size++;
		}
	}
	
	return newas;
}

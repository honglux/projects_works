#!/bin/sh
#SBATCH --cpus-per-task=16
#SBATCH --time=0-20:00:00
#SBATCH --output=run_dij_openmp_para_out.txt

## Honglu Xu
## EECS438 FP
## hxx171

cp dijkstra_openmp_para.c $PFSDIR/.
cp graph200_10_1 $PFSDIR/.
cp graph250_10_1 $PFSDIR/.
cp graph300_10_1 $PFSDIR/.
cp graph350_10_1 $PFSDIR/.
cp graph400_10_1 $PFSDIR/.

cd $PFSDIR

gcc dijkstra_openmp_para.c -o dijkstra_openmp_para -fopenmp

for thread in {1,2,4,8,16}
do
	for time in {1,2,3,4,5}
	do

		./dijkstra_openmp_para graph200_10_1 $thread
		./dijkstra_openmp_para graph250_10_1 $thread
		./dijkstra_openmp_para graph300_10_1 $thread
		./dijkstra_openmp_para graph350_10_1 $thread
		./dijkstra_openmp_para graph400_10_1 $thread

	done


done

echo "finished"
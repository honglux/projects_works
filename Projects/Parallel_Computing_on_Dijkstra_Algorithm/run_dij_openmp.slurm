#!/bin/sh
#SBATCH --cpus-per-task=16
#SBATCH --time=0-20:00:00
#SBATCH --output=run_dij_openmp_out.txt

## Honglu Xu
## EECS438 FP
## hxx171

cp dijkstra_openmp.c $PFSDIR/.
cp graph200_10_1 $PFSDIR/.
cp graph250_10_1 $PFSDIR/.
cp graph300_10_1 $PFSDIR/.
cp graph350_10_1 $PFSDIR/.
cp graph400_10_1 $PFSDIR/.

cd $PFSDIR

gcc dijkstra_openmp.c -o dijkstra_openmp -fopenmp

for thread in {1,2,4,8,16}
do
	for time in {1,2,3,4,5}
	do

		./dijkstra_openmp graph200_10_1 $thread
		./dijkstra_openmp graph250_10_1 $thread
		./dijkstra_openmp graph300_10_1 $thread
		./dijkstra_openmp graph350_10_1 $thread
		./dijkstra_openmp graph400_10_1 $thread

	done


done

echo "finished"
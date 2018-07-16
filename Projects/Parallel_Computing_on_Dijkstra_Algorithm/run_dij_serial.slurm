#!/bin/sh
#SBATCH --cpus-per-task=1
#SBATCH --time=0-20:00:00
#SBATCH --output=run_dij_serial_out.txt

## Honglu Xu
## EECS438 FP
## hxx171

cp dijkstra_serial.c $PFSDIR/.
cp graph200_10_1 $PFSDIR/.
cp graph250_10_1 $PFSDIR/.
cp graph300_10_1 $PFSDIR/.
cp graph350_10_1 $PFSDIR/.
cp graph400_10_1 $PFSDIR/.

cd $PFSDIR

gcc dijkstra_serial.c -o dijkstra_serial

for time in {1,2,3,4,5}
do
	./dijkstra_serial graph200_10_1
	./dijkstra_serial graph250_10_1
	./dijkstra_serial graph300_10_1
	./dijkstra_serial graph350_10_1
	./dijkstra_serial graph400_10_1
done

echo "finished"
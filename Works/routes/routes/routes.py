 
"""
Finding the shortest path between two cities,
using a single-source shortest distance approach.
CIS 210 project 5.

Authors:Honglu Xu
"""

import sys
#import argparse

#import settings


def read_distances(map_file):
	"""Read a distance table from a named file into a dict
	   mapping sources to lists of (destination, distance) pairs. 
	Args:
	   map_file: A readable text file in which each line either 
		   begins with #  (indicating a comment line) or is of the form
		   from location, to location, distance or time, for example
			  Minis Tirith,Cair Andros,5
		   indicating one can travel from Minis Tirith to Cair Andros in 5.0 hours.
	Returns:
		Dict in which each entry d[from] is a list [(to, cost), (to, cost), ... ]
		where from is a location name, to is a location name, and cost is time
		or distance
		as a floating point number.  If x,y,z appears in the input file, then 
		we should have both d[x] contains (y,z) and d[y] contains (x,z), i.e., 
		we assume that roads are bi-directional. 
	"""
	connections = dict() 
	for line in map_file:
		line = line.strip()  
		if line.startswith("#") or line=="" :
			#print("Skipping comment: ", line)
			continue  ## Discard and go on to next
		#print("Processing line: ", line)
		fields = line.split(",")
		place_from = fields[0]
		place_to = fields[1]
		cost = float(fields[2])
		if not (place_from in connections): 
			connections[place_from] = [ ]
		connections[place_from].append( (place_to, cost) )
		if not (place_to in connections): 
			connections[place_to] = [ ]
		connections[place_to].append( (place_from, cost) ) 
	return connections
	
def show_roads(roads):
	"""Print roads from dict (for debugging).
	   Args: 
		 roads:  A dict in which
				roads[Chicago] == [("Atlanta", 30.0), ("Austin", 25.0)]
			  means that there is a 30.0 mile road from Chicago to Atlanta and a 
			  25.0 mile road from Chicago to Austin.
	   Returns: 
			nothing
	   Effects: 
			Prints a textual representation of the road connections
	"""
	for from_place in roads:
		print(from_place + ":")
		for hop in roads[from_place]:
			to_place, dist = hop
			print("\t->" + to_place + " (" + str(dist) + ")")
			

def dfs(place, dist_so_far, roads, distances):
	"""Depth-first search, which may continue from from_place if dist_so_far    
		is the shortest distance at which it has yet been reached.  
	   Args: 
		  place: Currently searching from here
		  dist_so_far:  Distance at which from_place has been reached 
			  this time (which may not be the shortest path to from_place)
		  roads:  dict mapping places to lists of hops of the form (place, hop-distance)
		  distances: dict mapping places to the shortest distance at which they 
			   have been reached so far (up to this time). 
	"""
	dist_now=dist_so_far	#save the distance for now
	for sta_pla in roads:	#for start place in roads
		if sta_pla==place:
			for ele in roads[sta_pla]:	#read each element
				dist_so_far=dist_now	#start at the basic distance every time
				approach,dis=ele	#where we get, distance we get from start place
				if approach not in distances:
					dist_so_far+=dis
					distances[approach]=dist_so_far
					dfs(approach, dist_so_far, roads, distances)
				else:
					dist_so_far+=dis
					if dist_so_far<distances[approach]:
						distances[approach]=dist_so_far
						dfs(approach, dist_so_far, roads, distances)
					else:
						pass
	return
	
def main():
	"""
	Main program gets city pair and map file name,
	reports distance or reports lack of connectivity.
	"""
	#parser = argparse.ArgumentParser(
		#description="Find shortest route in road network")
	#parser.add_argument('from_place', 
				#help = "Starting place (quoted if it contains blanks)")
	#parser.add_argument('to_place', 
				#help = "Destination place (quoted if it contains blanks)")
	#parser.add_argument('map_file', type=argparse.FileType('r'),
				#help = "Name of file containing road connections and distances")
	#args = parser.parse_args()
	try:
		settings = open("settings.txt",'r')
	except:
		print("Settings file error!")
		exit(1)
	for line in settings:
		file_name = line
	try:
		map_f = open(file_name,'r')
	except:
		print("Map file error!")
		exit(1)
	roads = read_distances(map_f)
	#map_file = args.map_file

	while True:
	
		start_place = input("Enter the start place: ")
		#print (start_place)
		destination = input("Enter the destination place: ")
		
		#print (roads)
		if not start_place in roads: 
			print("Start place ", start_place, " is not on the map")
			#exit(1)
			continue
		if not destination in roads: 
			print("Destination ", destination, " is not on the map")
			#exit(1)
			continue
		
		distances = {start_place:0.0}
		
		dfs(start_place, 0.0, roads, distances )

		if destination in distances :
			print("Distance from {} to {} is {}".format(
				start_place,destination, distances[destination]))
		else:
			print("You can't get from {} to {}".format(start_place, destination))
			
		if (input("Type in 'e' to close the window, anyting else to do it again.") == 'e'):
			break

if __name__ == "__main__":
	main()
		
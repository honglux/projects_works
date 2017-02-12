#include <sstream>     	// std::istringstream
#include <fstream>
#include <map>		// std::multimap
#include <algorithm>   	// std::copy, std::for_each

#include "mr.hpp"
#include "ioutils.hpp"
#include "sentenceStats.hpp"
using namespace std;

namespace mr {

// Map and reduce methods to count occurrences of a word in a given text.

// A specialized map function with string keys and int values
void
SentenceStats::MRmap(const std::map<std::string,std::string> &input,
				std::multimap<std::string,int> &out_values) {
	IOUtils io;
	// input: in a real Map Reduce application the input will also be a map
	// where the key is a file name or URL, and the value is the document's contents.
	// Here we just take the string input and process it.
	for (auto it = input.begin(); it != input.end(); it++ ) {
		std::string inputString = io.readFromFile(it->first);

		std::istringstream iss(inputString);
		std::string sentenceMark = "";
		std::string appendent = "";
		int couter = 0;
		// Split up the input into words
		do {
			couter++;
			std::string word = "";
			iss >> word;
			appendent = word + " ";
			sentenceMark += appendent;
			appendent = "";

			if( word.length() != 0) {
				int tail = word.length()-1;
				if(word.at(tail) == '.' || word.at(tail) == '!' || word.at(tail) == '?') {
					out_values.insert(std::pair<std::string,int>(sentenceMark, couter));
					couter = 0;
					sentenceMark = "";
				}
			}
		} while (iss);
		if(sentenceMark != "") 
			out_values.insert(std::pair<std::string,int>(sentenceMark, couter));
	}
}

// A specialized reduce function with string keys and int values
void
SentenceStats::MRreduce(const std::multimap<std::string,int> &intermediate_values,
					std::map<std::string,int> &out_values) {
/*	TRY(intermediate_values, out_values);
}
	
void 
SentenceStats::TRY(std::multimap<string,int> intermediate_values, 
				std::map<std::string,int> &out_values) // Min Max and Avg function
{
	*/
	//multimap<string, int>::iterator iter;
	auto iter = intermediate_values.begin();

	int max=iter->second;
	int min=iter->second;
	float total=0.0f;
	int couter=0;

	for(iter=intermediate_values.begin(); iter!=intermediate_values.end(); iter++) {
		if(iter->second > max)
			max = iter->second;
		if(iter->second < min)
			min = iter->second;
		couter++;
		total += iter->second;
	}
	
	float average=0.0f;
	average = total/couter;
	
	out_values["Maximum sentence length: "] = max;
	out_values["Minimum sentence length: "] = min;
	out_values["Average sentence length: "] = average;
	/*out_values.insert(std::pair<string, int>("Maximum sentence length", max));
	out_values.insert(std::pair<string, int>("Minimum sentence length", min));
	out_values.insert(std::pair<string, int>("Average sentence length", average));
	*/
}

}; // namespace mr

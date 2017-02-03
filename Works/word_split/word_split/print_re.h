#include<iostream>
#include<vector>
#include<string>

using namespace std;

string print_re(string str, vector<pair<pair<int, int>, int> > word_r)
{
	string temp_str="";
	for (vector<pair<pair<int, int>, int> >::iterator iter = (word_r.end()-1); iter > word_r.begin(); iter--)
	{
		temp_str += (str.substr((*iter).first.first, ((*iter).first.second - (*iter).first.first) + 1)+" ");
	}
	temp_str += (str.substr(word_r[0].first.first, (word_r[0].first.second - word_r[0].first.first) + 1));
	return temp_str;
}
#include<iostream>
#include<string>
#include<vector>

using namespace std;

bool recursion_find(string str, vector<string>& dict, int i, vector<pair<pair<int, int>, int> > & word_r)
{
	string temp_str="";
	pair<int, int> range;
	pair<pair<int, int>, int> spl_ele;
	if (i >= str.length())
	{
		return true;
	}
	else if (i >= 0 && i < str.length())
	{
		for (int j = i; j < str.length(); j++)
		{
			temp_str = str.substr(i, (j - i) + 1);
			if (search(temp_str, dict, 0, dict.size()) && recursion_find(str, dict, j + 1, word_r))
			{

				range = make_pair(i, j);
				spl_ele = make_pair(range, i);
				word_r.push_back(spl_ele);
				return true;
			}
		}
	}
	return false;
}
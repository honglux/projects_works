#include<iostream>
#include<string>
#include<vector>

#include "search.h"

using namespace std;

bool iterative_find(string str, vector<string>& dict, vector<pair<pair<int, int>, int> > & word_i)
{
	bool **split;
	int m = str.size();
	int n = str.size();

	split = (bool **)malloc(sizeof(bool *)* m);
	for (int i = 0; i<m; i++)
	{
		split[i] = (bool *)malloc(sizeof(bool)* n);
	}

	string temp_str;
	pair<int, int> range;
	pair<pair<int, int>, int> spl_ele;

	for (int i = 0; i < str.size(); i++)
	{
		for (int left=0; left < str.size(); left++)
		{
			int right = left + i;
			if (right < str.size())
			{
				temp_str = str.substr(left, i+1);
				if (left == right)
				{
					if ((search(temp_str, dict, 0, dict.size())))
					{
						split[left][right] = true;
						range = make_pair(left, left);
						spl_ele = make_pair(range, left);
						word_i.push_back(spl_ele);
					}
					else { split[left][right] = false; }
				}
				else if(left<right)
				{
					for (int k = left; k < right; k++)
					{
						if (split[left][k] && split[k+1][right])
						{
							split[left][right] = true;

							range = make_pair(left, right);
							spl_ele = make_pair(range, k+1);
							word_i.push_back(spl_ele);
							break;
						}
						else if (search(temp_str, dict, 0, dict.size()))
						{
							split[left][right] = true;

							range = make_pair(left, right);
							spl_ele = make_pair(range, left);
							word_i.push_back(spl_ele);
							break;
						}
						else { split[left][right] = false; }
					}
				}
			}
		}
	}

	bool result=split[0][str.size() - 1];

	for (int i = 0; i<m; i++)
	{
		free(split[i]);
	}
	free(split);

	return result;

}
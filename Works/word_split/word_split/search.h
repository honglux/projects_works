#include<iostream>
#include<string>
#include<vector>

using namespace std;

bool search(string str,vector<string>& dict,int left,int right)
{
	if (left > right)
	{
		return false;
	}
	else if (left == right)
	{
		if (str.compare(dict[left]) == 0)
		{
			return true;
		}
		else {return false;}
	}
	else if (left < right)
	{
		if (str.compare(dict[(left+right)/2]) < 0)
		{
			return search(str, dict, left, (left + right) / 2);
		}
		else if (str.compare(dict[(left + right) / 2]) > 0)
		{
			return search(str, dict, (((left + right)+1) / 2), right);
		}
		else if (str.compare(dict[(left + right) / 2]) == 0)
		{
			return true;
		}
	}
	return false;
}
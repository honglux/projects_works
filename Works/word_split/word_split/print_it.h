#include<iostream>
#include<vector>
#include<string>

using namespace std;

vector<pair<int,int> > get_it(vector<pair<pair<int, int>, int> > word_i, int left, int right)
{
	vector<pair<int, int> > picked_w;
	int k;

	for (vector<pair<pair<int, int>, int> >::iterator iter = word_i.begin(); iter != word_i.end(); iter++)
	{
		if (((*iter).first) == make_pair(left, right))
		{
			k = (*iter).second;
		}
	}

	if (left == k)
	{
		picked_w.push_back(make_pair(left, right));
		return picked_w;
	}
	else
	{
		k = k - 1;
		vector<pair<int, int> > temp_left = get_it(word_i, left, k);
		vector<pair<int, int> > temp_right = get_it(word_i, k + 1, right);
		picked_w.insert(picked_w.end(), temp_left.begin(), temp_left.end());
		picked_w.insert(picked_w.end(), temp_right.begin(), temp_right.end());
		return picked_w;
	}
	return picked_w;

}

string print_it(string str, vector<pair<pair<int, int>, int> > word_i, int left, int right)
{
	vector<pair<int, int> > picked_w = get_it(word_i, left, right);
	
	//sort;

	//vector<pair<int, int>> sort_w;
	//int min = 10000;
	//int pre_min = -1;
	//pair<int, int> temp;
	//for (int i = 0; i < picked_w.size(); i++)
	//{
	//	/*for (vector<pair<int, int>>::iterator iter = picked_w.begin(); iter != picked_w.end(); iter++)
	//	{
	//		if ((*iter).first>pre_min)
	//		{
	//			pre_min = (*iter).first;
	//			temp = *iter;
	//			break;
	//		}
	//	}*/
	//	for (vector<pair<int, int>>::iterator iter = picked_w.begin(); iter != picked_w.end(); iter++)
	//	{
	//		if ((*iter).first>pre_min && (*iter).first < min)
	//		{
	//			min = (*iter).first;
	//			temp = *iter;
	//		}
	//	}
	//	sort_w.push_back(temp);
	//	pre_min = min;
	//	min = 10000;
	//}	

	string result="";
	for (vector<pair<int, int> >::iterator iter = picked_w.begin(); iter != picked_w.end(); iter++)
	{
		result += (str.substr((*iter).first, ((*iter).second - (*iter).first) + 1)+" ");
	}
	result = result.substr(0, result.length() - 1);

	return result;
}
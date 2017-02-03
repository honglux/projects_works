#include<iostream>
#include<fstream>
#include<string>
#include<vector>
#include<stdlib.h>

#include "iterative.h"
#include "recursion.h"
#include "print_it.h"
#include "print_re.h"

using namespace std;

ifstream& open_file(ifstream &, const string &);

int main()
{
	ifstream infile;

	if (!open_file(infile, "./diction10k.txt"))
	{
		cout << "Dict error!!!" << endl;
		system("pause");
		return -1;
	}

	string data;
	int counter=0;
	while (infile >> data, !infile.eof())
	{
		counter++;
	}

	infile.clear();
	infile.close();

	vector<string> dict;

	if (!open_file(infile, "./diction10k.txt"))
	{
		cout << "Dict error2!!!" << endl;
		system("pause");
		return -1;
	}

	while (infile >> data, !infile.eof())
	{
		dict.push_back(data);
	}

	infile.clear();
	infile.close();

	bool no_exit = true;
	while(no_exit == true)
	{
		/*
		if (!open_file(infile, "input.txt"))
		{
			cout << "Error!!!" << endl;
			system("pause");
			return -1;
		}
		*/

		//infile >> data;
		//int line = stoi(data);
		string str;
		string result="";

		//for (int i = 0; i < line; i++)
		//{
		
		cout << "Please enter your string: " << endl;
		cin >> str;

		vector<pair<pair<int, int>, int> > word_i;

		result += ("phrase: ");
		//string num = to_string((i + 1));
		//result += num;
		result += "\n";
		result += (str + "\n");
		result += "\n";
		result += "iterative attempt: \n";
		if (iterative_find(str, dict, word_i) == true)
		{
			result += "YES, can be split \n"; 
			result += (print_it(str, word_i, 0, str.size() - 1)+ "\n");
		}
		else
		{
			result += "NO, can not be split \n";
		}
		result += "\n";

		vector<pair<pair<int, int>, int> > word_r;
			
		result += "memoized attempt: \n";
		if (recursion_find(str, dict, 0, word_r) == true)
		{
			result += "YES, can be split \n";
			result += (print_re(str, word_r) + "\n");
		}
		else
		{
			result += "NO, can not be split \n";
		}
		result += "\n";
		//}

		//infile.clear();
		//infile.close();

		cout << result << endl;

		cout << "Enter 'e' to exit, anything else to continue: " << endl;
		string no_exit_str;
		cin >> no_exit_str;
		if (no_exit_str == "e")
		{
			no_exit = false;
		}

	}

	//system("pause");
	return 0;

}

ifstream& open_file(ifstream &in, const string &file)
{
	in.close();
	in.clear();
	in.open(file.c_str());
	return in;
}
//Initial Template for C++
#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;
//https://practice.geeksforgeeks.org/problems/pair-sum-in-vector/1

void sum(vector<pair<int, int> > v);

//Position this line where user code will be pasted.
void sum(vector<pair<int, int> > v)
{
    long long sum = 0;
    //Your code here
    size_t maxCount = v.size();
    for (size_t i = 0; i < maxCount; i++)
    {
        sum += v[i].second;
    }
    cout << sum;
    cout << endl;
}

int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int n;
        cin >> n;
        vector<pair<int, int> > v; //Making a vector that holds pairs
        for (int i = 0; i < n; i++)
        {
            int x, y;
            cin >> x >> y;
            v.push_back(make_pair(x, y)); //Pushing a pair in the vector
        }

        sum(v); //The sum function
    }
    return 0;
}
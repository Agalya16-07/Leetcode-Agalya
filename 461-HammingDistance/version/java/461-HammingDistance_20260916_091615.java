// Last updated: 9/16/2026, 9:16:15 AM
1class Solution {
2    public int hammingDistance(int x, int y) {
3        int z = x^y,count=0;
4        while(z>0)
5        {
6            if((z&1)==1)
7            {
8                count++;
9            }
10            z = z>>>1;
11        }
12
13        return count;
14    }
15}
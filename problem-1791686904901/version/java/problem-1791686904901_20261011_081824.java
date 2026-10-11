// Last updated: 10/11/2026, 8:18:24 AM
1class Solution {
2    public boolean threeFibonacciSum(int n) {
3        int a=0;
4        int b=1;
5        while(a+b<=n){
6            int c=a+b;
7            if(a+b+c==n)
8                return true;
9            a=b;
10            b=c;
11        
12        }
13        return false;
14    }
15}
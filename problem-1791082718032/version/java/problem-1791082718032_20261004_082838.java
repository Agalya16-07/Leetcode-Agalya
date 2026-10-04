// Last updated: 10/4/2026, 8:28:38 AM
1class Solution {
2    public long maxAlternatingSum(int[] a) {
3        long p0=a[0],n0=Long.MIN_VALUE/4;
4        long p1 = Long.MIN_VALUE/4,n1 = Long.MIN_VALUE/4;
5        long pp = p0,pn=n0,ans=p0;
6        for(int i=1; i<a.length; i++){
7            long x=a[i];
8            long np0 = Math.max(x,n0+x);
9            long nn0=p0-x;
10            long np1 = Math.max(x,Math.max(n1+x,pn+x));
11            long nn1 = Math.max(p1-x,pp-x);
12            pp=p0;
13            pn=n0;
14            p0=np0;
15            n0=nn0;
16            p1=np1;
17            n1=nn1;
18            ans = Math.max(ans,Math.max(p0,Math.max(n0,Math.max(p1,n1))));
19        }
20        return ans;
21    }
22}
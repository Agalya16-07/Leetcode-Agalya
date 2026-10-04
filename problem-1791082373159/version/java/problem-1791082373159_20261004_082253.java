// Last updated: 10/4/2026, 8:22:53 AM
1class Solution {
2    int d(int a,int b){
3        int x=Math.abs(a-b);
4        return Math.min(x,10-x);
5    }
6    public int minRotations(int n, String s) {
7        int ans=d('0',s.charAt(0));
8        for(int i=1; i<n; i++)
9           ans+=d(s.charAt(i-1),s.charAt(i));
10            int best=ans;
11        for(int k=0; k<n; k++){
12            int old =(k==0)?d(0,s.charAt(0)-'0'):d(s.charAt(k-1)-'0',s.charAt(k)-'0');
13            int ne =(k==0)?d(0,s.charAt(n-1)-'0'):d(s.charAt(k-1)-'0',s.charAt(n-1)-'0'); 
14            best = Math.min(best,ans-old+ne);
15        }
16        return best;
17    }
18}
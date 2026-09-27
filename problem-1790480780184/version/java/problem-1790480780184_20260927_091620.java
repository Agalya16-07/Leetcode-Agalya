// Last updated: 9/27/2026, 9:16:20 AM
1class Solution {
2    public int maxSubarray(int[] nums) {
3        int n=nums.length,l=0,ans=0;
4        java.util.HashMap<Integer,Integer> f = new java.util.HashMap<>();
5        for(int r=0; r<n; r++){
6            int x=nums[r];
7            while(bad(f,x)){
8                int y=nums[l++];
9                int c = f.get(y);
10                if(c==1)f.remove(y);else f.put(y,c-1);
11            }
12            f.put(x,f.getOrDefault(x,0)+1);
13            ans=Math.max(ans,r-l+1);
14        }
15        return ans;
16    }
17    boolean bad(java.util.HashMap<Integer,Integer>f,int x){
18        if(f.isEmpty())return false;
19        for(int a:f.keySet()){
20            int b=x-a;
21            if(f.containsKey(b)){
22                if(a!=b)return true;
23                if(f.get(b)>=2)return true;
24            }
25            if(x==0){
26                if(f.get(a)>=2)return true;
27            }else if(f.containsKey(a+x))return true;
28        }
29        return false;
30    }
31}
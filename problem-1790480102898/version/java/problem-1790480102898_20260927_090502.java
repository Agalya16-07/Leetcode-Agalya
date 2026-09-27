// Last updated: 9/27/2026, 9:05:02 AM
1class Solution {
2    public int maxEqualAdjacentPairs(int[] nums) {
3        int n = nums.length;
4        if(n<=1)return 0;
5        int base=0;
6        java.util.Map<Long,Integer> cnt = new java.util.HashMap<>();
7        int mg=0;
8        for(int i=0; i<n-1; i++){
9            int a=nums[i];
10            int b=nums[i+1];
11            if(a==b){
12                base++;
13            }else{
14                int mn=Math.min(a,b);
15                int mx = Math.max(a,b);
16                long key = ((long)mn<<32)|(mx&0xffffffffL);
17                int c = cnt.getOrDefault(key,0)+1;
18                cnt.put(key,c);
19                if(c>mg)mg=c;
20            }
21        }
22        return base+mg;
23    }
24}
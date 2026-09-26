// Last updated: 9/26/2026, 8:48:50 PM
1class Solution {
2    public int longestSubarray(int[] nums, int k) {
3       int n = nums.length;
4        int ans=0;
5        for(int l=0; l<n; l++){
6            long sum=0;
7            java.util.HashSet<Integer> have = new java.util.HashSet<>();
8            for(int r=l; r<n; r++){
9                sum+=nums[r];
10                int two = (int)(2L*nums[r]%k);
11                two=(two%k+k)%k;
12                have.add(two);
13                int mod=(int)(sum%k);
14                mod=(mod%k+k)%k;
15                if(mod==0||have.contains(mod)){
16                    ans=Math.max(ans,r-l+1);
17                }
18                if(n-l<=ans)
19                break;
20            }
21        }
22        return ans;
23    }
24}
// Last updated: 8/11/2026, 5:48:21 PM
class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int n = s.length();
        int i=0;
        int ans=0;
        while(i<n){
            int o=0,z=0;
            while(i<n && s.charAt(i)=='0'){
                z++;
                i++;

            }
            while(i<n && s.charAt(i)=='1'){
                o++;
                i++;
            }
            ans = Math.max(ans,2*Math.min(z,o));
        }
        return ans;
    }
}
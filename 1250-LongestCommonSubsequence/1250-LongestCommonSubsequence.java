// Last updated: 8/11/2026, 5:50:23 PM
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int s = text1.length();
        int t = text2.length();
        int[][] dp = new int[s+1][t+1];
        for(int i=1; i<=text1.length(); i++){
            for(int j=1; j<=text2.length(); j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[s][t];
    }
}
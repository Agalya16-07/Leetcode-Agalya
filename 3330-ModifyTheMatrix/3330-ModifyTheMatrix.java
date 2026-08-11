// Last updated: 8/11/2026, 5:47:37 PM
class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[][] ans = new int[m][n];
        for(int i=0; i<m; i++){
                ans[i]=matrix[i].clone();
            }
        
        for(int j=0; j<n; j++){
            int max=0;
            for(int i=0; i<m; i++){
                max=Math.max(max,matrix[i][j]);
            }
            for(int i=0; i<m; i++){
                if(ans[i][j]==-1)
                ans[i][j]=max;
            }
        }
        return ans;
        
    }
}
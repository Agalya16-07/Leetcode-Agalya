// Last updated: 8/11/2026, 5:47:50 PM
class Solution {
    public int areaOfMaxDiagonal(int[][] d) {
        double maxDiagonal = 0;
        int maxArea = 0;

        for (int i = 0; i < d.length; i++) {
            double diagonal = Math.sqrt(d[i][0] * d[i][0] + d[i][1] * d[i][1]);
            int area = d[i][0] * d[i][1];

            if (diagonal > maxDiagonal) {
                maxDiagonal = diagonal;
                maxArea = area;
            } else if (diagonal == maxDiagonal && area > maxArea) {
                maxArea = area;
            }
        }

        return maxArea;
    }
}
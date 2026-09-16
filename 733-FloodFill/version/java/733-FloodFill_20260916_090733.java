// Last updated: 9/16/2026, 9:07:33 AM
1class Solution {
2    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
3        this.dfs(image, sr, sc, color, image[sr][sc]);
4    return image;
5  }
6
7  // Helper method for the DFS flood fill
8  private void dfs(int[][] image, int sr, int sc, int color, int target) {
9    // Terminate if out of bounds, wrong color, or already filled
10    // The image[sr][sc] == color guard also handles the color == target edge case
11    if (sr < 0 || sr > image.length - 1 || sc < 0 || sc > image[0].length - 1
12        || image[sr][sc] != target || image[sr][sc] == color) {
13      return;
14    }
15
16    // Recolor this cell (also marks it as visited)
17    image[sr][sc] = color;
18
19    // Recurse in all four directions
20    this.dfs(image, sr + 1, sc, color, target);
21    this.dfs(image, sr - 1, sc, color, target);
22    this.dfs(image, sr, sc + 1, color, target);
23    this.dfs(image, sr, sc - 1, color, target);
24  }
25}
26
27// Main Class
28public class _733_Flood_Fill {
29  // Main method to test floodFill
30  public static void main(String[] args) {
31    int[][] image = new int[][] { { 1, 1, 1 }, { 1, 1, 0 }, { 1, 0, 1 } };
32    int sr = 1;
33    int sc = 1;
34    int color = 2;
35
36    int[][] result = new Solution().floodFill(image, sr, sc, color);
37
38    System.out.println("The modified image after performing the flood fill is : " + Arrays.deepToString(result));
39    }
40}
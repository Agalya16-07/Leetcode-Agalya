// Last updated: 8/12/2026, 2:12:27 PM
1class Solution {
2    public int largestRectangleArea(int[] heights) {
3         int n = heights.length;
4        int[] left = new int[n];
5        int[] right = new int[n];
6        Stack<Integer> stack = new Stack<>();
7
8        // Nearest Smaller to Left
9        for (int i = 0; i < n; i++) {
10            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) stack.pop();
11            left[i] = stack.isEmpty() ? -1 : stack.peek();
12            stack.push(i);
13        }
14
15        stack.clear(); // Reuse stack
16
17        // Nearest Smaller to Right
18        for (int i = n - 1; i >= 0; i--) {
19            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) stack.pop();
20            right[i] = stack.isEmpty() ? n : stack.peek();
21            stack.push(i);
22        }
23
24        int maxArea = 0;
25        for (int i = 0; i < n; i++) {
26            int width = right[i] - left[i] - 1;
27            maxArea = Math.max(maxArea, heights[i] * width);
28        }
29        return maxArea;
30    }
31}
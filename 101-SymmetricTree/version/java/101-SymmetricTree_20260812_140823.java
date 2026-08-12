// Last updated: 8/12/2026, 2:08:23 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public boolean isSymmetric(TreeNode root) {
18         return isMirror(root.left, root.right);
19    }
20    
21    private boolean isMirror(TreeNode n1, TreeNode n2) {
22        if (n1 == null && n2 == null) {
23            return true;
24        }
25        
26        if (n1 == null || n2 == null) {
27            return false;
28        }
29        
30        return n1.val == n2.val && isMirror(n1.left, n2.right) && isMirror(n1.right, n2.left);
31    }
32}
// Last updated: 8/12/2026, 2:14:31 PM
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
17    public List<String> binaryTreePaths(TreeNode root) {
18         List<String> result = new ArrayList<>();
19        dfs(root, "", result);
20        return result;
21    }
22
23    private void dfs(TreeNode node, String path, List<String> result) {
24        if (node == null) return;
25        //Append the current node's value to the path.
26        path += node.val;
27
28        //If it's a leaf node, add the path to the result list.
29        if (node.left == null && node.right == null) {
30            result.add(path);
31        } else {
32            path += "->";// Separate nodes in the path.
33            dfs(node.left, path, result);
34            dfs(node.right, path, result);
35        }
36    }
37}
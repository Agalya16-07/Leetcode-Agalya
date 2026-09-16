// Last updated: 9/16/2026, 9:11:08 AM
1class Solution {
2    boolean found = false;
3    public boolean validPath(int n, int[][] edges, int start, int end) {
4        if(start == end) return  true;
5        
6        Map<Integer,List<Integer>> graph = new HashMap();
7        boolean[] visited = new boolean[n];
8        
9        for(int i = 0 ; i < n ; i++) graph.put(i, new ArrayList());
10         //construct graph, add bidirectional vertex
11        for(int[] edge : edges){
12           graph.get(edge[0]).add(edge[1]);
13           graph.get(edge[1]).add(edge[0]);
14        }
15		//start dfs from start point
16        dfs(graph,visited,start,end);
17        return found;
18    }
19    
20    private void dfs(Map<Integer,List<Integer>> graph,boolean[] visited, int start, int end){
21        if(visited[start] || found) return;
22        visited[start] = true;
23        //when we found and neighbour which is equal to end point inside the recursion, voooleeey! break and return the true
24        for(int nei : graph.get(start)){
25            if(nei == end){
26                found = true;
27                break;
28            }
29            if(!visited[nei])
30                dfs(graph, visited, nei, end);
31        }        
32    }
33}
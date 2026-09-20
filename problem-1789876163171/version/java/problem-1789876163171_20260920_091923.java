// Last updated: 9/20/2026, 9:19:23 AM
1class Solution {
2    public long countIntersectingIntervals(int[][] intervals) {
3        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
4        PriorityQueue<Integer> pq = new PriorityQueue<>();
5        long c=0;
6        for(int[] n :intervals){
7            while(!pq.isEmpty() && pq.peek()<n[0]){
8                pq.poll();
9            }
10            c+=pq.size();
11            pq.offer(n[1]);
12        }
13        return c;
14    }
15}
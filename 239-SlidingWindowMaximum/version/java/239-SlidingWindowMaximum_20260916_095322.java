// Last updated: 9/16/2026, 9:53:22 AM
1class Solution {
2    public int[] maxSlidingWindow(int[] nums, int k) {
3         int n = nums.length;
4
5        Deque<Integer> deque = new ArrayDeque<>();
6
7        int[] result = new int[n-k+1];
8
9        // Build the first window
10        for(int i = 0; i < k; i++){
11
12            // Remove smaller/equal elements from the back
13            while(!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]){
14                deque.pollLast();
15            }
16
17            // Add current index
18            deque.offerLast(i);
19        }
20
21        // Store maximum of the first window
22        result[0] = nums[deque.peekFirst()];
23
24        // Process remaining windows
25        for(int i = k; i < n; i++){
26
27            // Remove expired index
28            if(deque.peekFirst() <= i-k){
29                deque.pollFirst();
30            }
31
32            // Remove smaller/equal elements from the back
33            while(!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]){
34                deque.pollLast();
35            }
36
37            // Add current index
38            deque.offerLast(i);
39
40            // Store current maximum
41            result[i-k+1] = nums[deque.peekFirst()];
42        }
43
44        return result;
45    }
46}
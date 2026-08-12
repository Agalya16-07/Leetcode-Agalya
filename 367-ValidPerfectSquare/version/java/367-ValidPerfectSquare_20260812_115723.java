// Last updated: 8/12/2026, 11:57:23 AM
1class Solution {
2    public boolean isPerfectSquare(int num) {
3        long left = 1;
4        long right = num;
5
6        while (left <= right) {
7            long mid = left + (right - left) / 2;
8            long square = mid * mid;
9
10            if (square == num) {
11                return true;
12            } 
13            else if (square < num) {
14                left = mid + 1;
15            } 
16            else {
17                right = mid - 1;
18            }
19        }
20
21        return false;
22    }
23}
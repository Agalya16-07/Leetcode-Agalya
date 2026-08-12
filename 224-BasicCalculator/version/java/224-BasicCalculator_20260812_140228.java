// Last updated: 8/12/2026, 2:02:28 PM
1class Solution {
2    public int calculate(String s) {
3         Stack<Integer> stack = new Stack<>();
4
5        int res = 0;
6        int curr = 0;
7        int sign = 1;
8
9        for (char c : s.toCharArray()) {
10
11            if (Character.isDigit(c)) {
12                curr = curr * 10 + (c - '0');
13            } 
14            else if (c == '+') {
15                res += curr * sign;
16                sign = 1;
17                curr = 0;
18            } 
19            else if (c == '-') {
20                res += curr * sign;
21                sign = -1;
22                curr = 0;
23            } 
24            else if (c == '(') {
25                stack.push(res);
26                stack.push(sign);
27                res = 0;
28                sign = 1;
29                curr = 0;
30            } 
31            else if (c == ')') {
32                res += curr * sign;
33                curr = 0;
34                res *= stack.pop();
35                res += stack.pop();
36            }
37        }
38
39        res += sign * curr;
40        return res;
41    }
42}
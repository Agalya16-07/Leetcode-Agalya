// Last updated: 8/11/2026, 5:50:56 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> l = new ArrayList<>();
        while(head!=null){
            l.add(head.val);
            head = head.next;
        }
        int n = l.size();
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; i++){
            while(!st.isEmpty() && l.get(i)>l.get(st.peek())){
                int idx = st.pop();
                ans[idx]=l.get(i);
            }
            st.push(i);
        }
        return ans;
    }
}
// Last updated: 8/11/2026, 5:49:35 PM
class Solution {
    public int countStudents(int[] s, int[] sa) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        int t=0;
        for(int i=sa.length-1;i>=0; i--){
            st.push(sa[i]);
        }
        for(int e:s){
            q.add(e);
        }
        while(!q.isEmpty() && !st.isEmpty() && t<st.size()){
            if(q.peek()==st.peek()){
                q.poll();
                st.pop();
                t=0;
            }else{
                t++;
                q.add(q.poll());
            }
        }
        return q.size();
    }
}
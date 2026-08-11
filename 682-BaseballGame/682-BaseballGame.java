// Last updated: 8/11/2026, 5:52:30 PM
class Solution {
    public int calPoints(String[] op) {
        Stack<Integer> st = new Stack<>();
        int ans=0;
        for(String ops:op){
            if(ops.equals("+")){
                int top=st.pop();
                int newtop = top+st.peek();
                st.push(top);
                st.push(newtop);
            }else if(ops.equals("C")){
                ans-=st.pop();
                continue;
            }else if(ops.equals("D")){
                st.push(2*st.peek());
            }else{
            st.push(Integer.valueOf(ops));
            }
            ans+=st.peek();
        }
        return ans;
    }
}
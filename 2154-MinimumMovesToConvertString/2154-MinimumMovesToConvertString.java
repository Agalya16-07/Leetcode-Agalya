// Last updated: 8/11/2026, 5:49:01 PM
class Solution {
    public int minimumMoves(String s) {
        int c=0;
        for(int i=0; i<s.length();){
            if(s.charAt(i)=='X'){
                c++;
                i+=3;
            }else
            i++;
        }
        return c;
    }
}
// Last updated: 8/11/2026, 5:51:56 PM
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())
        return false;
        String temp=s+s;
        return temp.contains(goal);
    }
}
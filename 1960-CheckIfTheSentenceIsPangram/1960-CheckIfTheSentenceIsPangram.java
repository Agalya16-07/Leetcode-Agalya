// Last updated: 8/11/2026, 5:49:16 PM
class Solution {
    public boolean checkIfPangram(String s) {
        HashSet<Character> hs =  new HashSet<>();
        for(char ch:s.toCharArray()){
            hs.add(ch);
        }
        return hs.size()==26;

    }
}
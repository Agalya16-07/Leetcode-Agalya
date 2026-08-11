// Last updated: 8/11/2026, 5:48:49 PM
class Solution {
    public boolean isSameAfterReversals(int num) {
        if (num == 0) 
            return true;       
        if (num % 10 == 0) 
            return false;     
        return true;           
    }
}

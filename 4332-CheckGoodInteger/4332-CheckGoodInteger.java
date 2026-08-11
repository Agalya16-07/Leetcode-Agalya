// Last updated: 8/11/2026, 5:47:34 PM
class Solution {
    public boolean checkGoodInteger(int n) {
        int s=0;
        int ss=0;
        while(n>0){
            int d = n%10;
            s+=d;
            ss+=d*d;
            n/=10;
            
        }
        int ans = ss-s;
        if(ans>=50)
            return true;
        return false;
    }
}
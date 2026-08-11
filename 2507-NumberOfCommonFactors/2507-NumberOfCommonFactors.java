// Last updated: 8/11/2026, 5:48:40 PM
class Solution {
    public int commonFactors(int a, int b) {
        int c=0;
        int min = Math.min(a,b);
        for(int i=1; i<=min; i++){
            if(a%i==0 && b%i==0){
                c++;
            }
        }
        return c;
    }
}
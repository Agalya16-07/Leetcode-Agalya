// Last updated: 8/11/2026, 5:50:07 PM
class Solution {
    public int subtractProductAndSum(int n) {
        int d,sum=0,p=1,a;
        while(n!=0){
            d=n%10;
            sum+=d;
            p*=d;
            n/=10;
        }
        return (p-sum);
    }
}
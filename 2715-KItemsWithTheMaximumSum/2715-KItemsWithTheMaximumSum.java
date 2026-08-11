// Last updated: 8/11/2026, 5:48:23 PM
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int t = Math.min(numOnes, k);
        int sum = t;
        int r = k - t;
        if (r <= numZeros) {
            return sum;
        }
        r -= numZeros;
        sum -= r;
        return sum;
    }
}
// Last updated: 8/11/2026, 5:47:16 PM
class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int i = prices.length-1;
        int j=discounts.length-1;
        double total=0;
        while(i>=0){
            if(j>=0){
                total+=prices[i]*(100.0-discounts[j])/100.0;
                j--;
            }else{
                total+=prices[i];
            }
            i--;
        }
        return total;
    }
}
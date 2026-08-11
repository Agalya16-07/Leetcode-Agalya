// Last updated: 8/11/2026, 5:49:47 PM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
         int total = 0;
        int empty = 0;
        while (numBottles > 0) {
            total += numBottles;     
            empty += numBottles;      
            numBottles = empty / numExchange;
            empty = empty % numExchange;     
        }
        return total;
    }
}
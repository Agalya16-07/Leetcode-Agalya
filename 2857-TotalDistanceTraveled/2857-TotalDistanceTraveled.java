// Last updated: 8/11/2026, 5:48:05 PM
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int d = 0;
        int u = 0;

        while (mainTank > 0) {
            mainTank--;
            u++;
            d += 10;

            if (u % 5 == 0 && additionalTank > 0) {
                mainTank++;
                additionalTank--;
            }
        }
        return d;
    }
}

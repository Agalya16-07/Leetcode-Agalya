// Last updated: 8/11/2026, 5:47:48 PM
import java.util.*;

public class Solution{

    public static long largestPerimeter(int[] nums) {

        Arrays.sort(nums);

        long sum = 0;

        for (int num : nums)
            sum += num;

        for (int i = nums.length - 1; i >= 2; i--) {

            if (sum - nums[i] > nums[i]) {
                return sum;
            }

            sum -= nums[i];
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        System.out.println(largestPerimeter(nums));
    }
}
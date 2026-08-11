// Last updated: 8/11/2026, 5:52:43 PM
class Solution {

    public int[] findErrorNums(int[] nums) {

        int n = nums.length;
        int i = 0;

        while (i < n) {

            int correct = nums[i] - 1;

            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        for (i = 0; i < n; i++) {

            if (nums[i] != i + 1) {
                return new int[]{nums[i], i + 1};
            }
        }

        return new int[]{-1, -1};
    }

    private void swap(int[] nums, int i, int j) {

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
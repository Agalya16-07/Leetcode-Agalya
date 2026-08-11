// Last updated: 8/11/2026, 5:51:18 PM
class Solution {
    public String reverseOnlyLetters(String s) {

        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            // Skip non-letter from left
            while (left < right && !Character.isLetter(arr[left])) {
                left++;
            }

            // Skip non-letter from right
            while (left < right && !Character.isLetter(arr[right])) {
                right--;
            }

            // Swap letters
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }
}
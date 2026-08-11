// Last updated: 8/11/2026, 5:49:26 PM
class Solution {
    public boolean halvesAreAlike(String s) {

        int count1 = 0;
        int count2 = 0;

        int n = s.length();

        // Count vowels in the first half
        for (int i = 0; i < n / 2; i++) {
            if (isVowel(s.charAt(i))) {
                count1++;
            }
        }

        // Count vowels in the second half
        for (int i = n / 2; i < n; i++) {
            if (isVowel(s.charAt(i))) {
                count2++;
            }
        }

        return count1 == count2;
    }

    // Function to check if a character is a vowel
    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}
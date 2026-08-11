// Last updated: 8/11/2026, 5:49:11 PM
class Solution {
    public String sortSentence(String s) {

        String[] words = s.split(" ");
        String[] result = new String[words.length];

        // Place each word in its correct position
        for (String word : words) {

            int index = word.charAt(word.length() - 1) - '1';

            result[index] = word.substring(0, word.length() - 1);
        }

        // Build the final sentence
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < result.length; i++) {
            sb.append(result[i]);

            if (i != result.length - 1) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}
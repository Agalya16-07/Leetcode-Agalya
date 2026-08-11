// Last updated: 8/11/2026, 5:51:08 PM
import java.util.*;

class Solution {

    public String[] reorderLogFiles(String[] logs) {

        Arrays.sort(logs, (a, b) -> {

            int idx1 = a.indexOf(' ');
            int idx2 = b.indexOf(' ');

            String id1 = a.substring(0, idx1);
            String id2 = b.substring(0, idx2);

            String content1 = a.substring(idx1 + 1);
            String content2 = b.substring(idx2 + 1);

            boolean digit1 = Character.isDigit(content1.charAt(0));
            boolean digit2 = Character.isDigit(content2.charAt(0));

            if (!digit1 && !digit2) {
                int cmp = content1.compareTo(content2);

                if (cmp != 0)
                    return cmp;

                return id1.compareTo(id2);
            }

            if (!digit1)
                return -1;

            if (!digit2)
                return 1;

            return 0;
        });

        return logs;
    }
}
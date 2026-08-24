package Hard;

public class MinimumWindowSubstring {

    /* LeetCode 76 Hard*/
    public static void main(String[] args) {

        String s = "ADOBECODEBANC";
        String t = "BANC";

        System.out.println(minWindow(s,t));
    }
        public static String minWindow(String s, String t) {

            if (s.length() < t.length()) {
                return "";
            }

            int[] hash = new int[256];

            for (int i = 0; i < t.length(); i++) {
                hash[t.charAt(i)]++;
            }

            int l = 0;
            int r = 0;

            int count = 0;

            int minLength = Integer.MAX_VALUE;
            int startingIndex = -1;

            while (r < s.length()) {

                // Expand window
                if (hash[s.charAt(r)] > 0) {
                    count++;
                }

                hash[s.charAt(r)]--;

                // Try shrinking window
                while (count == t.length()) {

                    if (r - l + 1 < minLength) {
                        minLength = r - l + 1;
                        startingIndex = l;
                    }

                    hash[s.charAt(l)]++;

                    if (hash[s.charAt(l)] > 0) {
                        count--;
                    }

                    l++;
                }

                r++;
            }

            return startingIndex == -1
                    ? ""
                    : s.substring(startingIndex, startingIndex + minLength);
        }
    }



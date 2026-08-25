import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListAllAnagram {

    public static void main(String[] args) {

        findAnagrams("abc","abc");
    }
        public static List<Integer> findAnagrams(String s, String p) {

            List<Integer> result = new ArrayList<>();

            if (s.length() < p.length()) {
                return result;
            }

            int[] required = new int[26];
            int[] window = new int[26];

            for (char ch : p.toCharArray()) {
                required[ch - 'a']++;
            }

            int windowSize = p.length();

            for (int i = 0; i < s.length(); i++) {

                // Add current character
                window[s.charAt(i) - 'a']++;

                // Maintain fixed window size
                if (i >= windowSize) {
                    window[s.charAt(i - windowSize) - 'a']--;
                }

                // Check if current window is an anagram
                if (i >= windowSize - 1 &&
                        Arrays.equals(required, window)) {

                    result.add(i - windowSize + 1);
                }
            }

            return result;
        }
    }


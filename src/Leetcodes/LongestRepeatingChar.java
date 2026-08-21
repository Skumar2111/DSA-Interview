package Leetcodes;

/*
* 424. Longest Repeating Character Replacement
* */
public class LongestRepeatingChar {

    public static void main(String[] args) {
        String s = "ABAB";
        int k = 2;
        System.out.println(characterReplacement(s,k));
    }



        public static int characterReplacement(String s, int k) {

            int[] frequency = new int[26];
            int left = 0 ;
            int right = 0;

            int maxLength = 0;
            int maxCount = 0;



            while(right < s.length())
            {
                frequency[s.charAt(right) - 'A']  ++;
                maxCount = Math.max(maxCount , frequency[s.charAt(right) - 'A']);

                if((right - left + 1) - maxCount > k)
                {
                    frequency[s.charAt(left) - 'A'] --;
                    left++;
                }

                maxLength = Math.max(maxLength , right - left +1);
                right++;

            }

            return maxLength;
        }
    }


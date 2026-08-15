package Leetcodes;

import java.util.HashSet;
import java.util.Set;

public class LengthOfSubString {
    public static void main(String[] args) {

        String string = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(string));
    }


        public static int lengthOfLongestSubstring(String s) {
            if(s.length() == 0)
            {
                return 0;
            }

            Set<Character> set = new HashSet<>();
            int max_ans = Integer.MIN_VALUE;
            int left_ptr = 0;

            for(int right_ptr = 0 ; right_ptr < s.length() ; right_ptr ++)
            {
                if(set.contains(s.charAt(right_ptr)))
                {
                    while(left_ptr < right_ptr && set.contains(s.charAt(right_ptr)))
                    {
                        set.remove(s.charAt(left_ptr));
                        left_ptr++;
                    }
                }

                set.add(s.charAt(right_ptr));
                max_ans = Math.max(max_ans, right_ptr - left_ptr + 1);
            }

            return max_ans;

        }
    }


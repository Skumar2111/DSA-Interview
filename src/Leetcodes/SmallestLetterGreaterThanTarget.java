package Leetcodes;

public class SmallestLetterGreaterThanTarget {

    public static void main(String[] args) {
        char[] letters = {'c','f','g'};
        nextGreatestLetter(letters,'a');
    }

        public static char nextGreatestLetter(char[] letters, char target) {
            char c = letters[0];

            int tar = target - 'a';

            for(int i = 0 ; i < letters.length ; i++)
            {
                int t = (int) letters[i] - 'a';
                if(t > tar)
                {
                    c = letters[i];
                    break;
                }
            }

            return c;
        }
    }


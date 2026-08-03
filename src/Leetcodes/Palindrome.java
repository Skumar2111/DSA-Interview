package Leetcodes;

public class Palindrome
{
    private char lowerCase(char ch){
        if(ch >= 'A' && ch <= 'Z'){
            return (char)(ch + 32);
        }

        return ch;
    }

    private boolean isAlphanumeric(char ch){
        return (ch >= 'A' && ch <= 'Z' ||
                ch >= 'a' && ch <= 'z' ||
                ch >= '0' && ch <= '9');
    }

    public boolean isPalindrome(String s) {
        int first = 0;
        int last = s.length() - 1;

        while(first < last){
            while(first < last && !isAlphanumeric(s.charAt(first))){
                first++;
            }

            while(first < last && !isAlphanumeric(s.charAt(last))){
                last--;
            }

            if(lowerCase(s.charAt(first)) == lowerCase(s.charAt(last))){
                first++;
                last--;
            } else {
                return false;
            }
        }

        return true;
    }
}


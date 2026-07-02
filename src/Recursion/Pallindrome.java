package Recursion;

public class Pallindrome {

    public static void main(String[] args) {

        String name = "abbac";
        int start = 0;
        int end = name.length()-1;

        System.out.println(checkPallingdrome(name,start,end));

    }

    private static boolean checkPallingdrome(String name, int start, int end) {

        if(start >= end)
        {
            return true;
        }

        return name.charAt(start) == name.charAt(end) && checkPallingdrome(name , start+1,end-1);

    }
}

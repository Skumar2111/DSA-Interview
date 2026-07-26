package DP;

import java.util.ArrayList;
import java.util.List;

public class Subsequence {

    static List<String> strings = new ArrayList<>();
    public static void main(String[] args) {

        String input = "qwerty";



        String ans = "";
        findSubsequence(input, ans);

        System.out.println(strings);
    }

    private static void findSubsequence(String input, String ans) {

        if(input.length() == 0)
        {
            strings.add(ans);
            return;
        }

        findSubsequence(input.substring(1),ans + input.charAt(0));

        findSubsequence(input.substring(1),ans);

    }


}

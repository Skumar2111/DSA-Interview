package Recursion;

import javax.swing.plaf.IconUIResource;

public class PowerSet {

    public static void main(String[] args) {
        String str = "abc";
        int index = 0;
        String curr = "";
        powerSet(str,index, curr);
    }

    private static void powerSet(String str,int index,String current) {

        int n = str.length();

        if(index == n)
        {
            System.out.println(current);
            return;
        }

        powerSet(str,index+1,current+str.charAt(index));
        powerSet(str,index+1,current);
    }
}

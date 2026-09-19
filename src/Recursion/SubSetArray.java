package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SubSetArray {

    public static void main(String[] args) {

        int[] array = {1,2,3};
        Stack<Integer> initial = new Stack<>();
        generateSubSet(array,0,initial);

    }

    private static void generateSubSet(int[] array, int index, Stack<Integer> initial) {

        if(index == array.length) {
            {
                System.out.print(initial);
            }
            return;

        }
        initial.push(array[index]);
        generateSubSet(array,index+1,initial);


        initial.pop();
        generateSubSet(array,index+1,initial);

    }
}

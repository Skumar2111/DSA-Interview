package Tree;

import java.util.Stack;

public class RevString {

    public static void main(String[] args) {
        String str = "I love programming";

        String[] strArr = str.split(" ");

        Stack<String> stringStack = new Stack<>();

        for(int i = 0 ; i < strArr.length ; i++)
        {
            stringStack.add(strArr[i]);
        }

        while(!stringStack.isEmpty())
        {
            System.out.println(stringStack.pop());
        }
    }
}

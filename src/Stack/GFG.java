package Stack;

import java.util.Stack;

/*Complete the function(s) below*/
class GfG {


    public static void main(String[] args) {

        /*
        *  Call all stack methods from here......
        * */

    }
    public void push(int a, Stack<Integer> s) {
        // add code here.
        s.add(a);
    }

    public int pop(Stack<Integer> s) {
        // add code here.
        return s.pop();

    }

    public int min(Stack<Integer> s) {
        // add code here.

        return  s.stream().min((a,b) -> a -b).get();

    }

    public boolean isFull(Stack<Integer> s, int n) {
        // add code here.
        if(s.size() == n)
        {
            return true;
        }
        return false;
    }

    public boolean isEmpty(Stack<Integer> s) {
        // add code here.
        return s.isEmpty();
    }
}
import java.util.LinkedList;

public class SearchLL {
    public static void main(String[] args) {

        int key = 3;
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        if(list.contains(key))
        {
            System.out.println("true");
            return;
        }
        else
        {
            System.out.println("false");
            return;
        }


    }
}

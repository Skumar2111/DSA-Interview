import java.util.ArrayList;

class Solve {


    public static void main(String[] args) {

        int[] arr = {1, 6, 5, 4, 7, 8, 4, 3, 2, 1};

        System.out.println(getStar(arr));

    }


    static ArrayList<Integer> getStar(int[] arr) {

        int curr_max = arr[arr.length - 1];

        ArrayList<Integer> list = new ArrayList<>();
        list.add(curr_max);

        // code here
        for(int i = arr.length - 2 ; i > 0 ;i--)
        {
            if(arr[i] > curr_max)
            {
                list.add(arr[i]);
                curr_max = arr[i];
            }
        }

        return list;
    }


}

import java.util.HashMap;

public class NonRepeating {

    public static void main(String[] args) {

        int[] arr = {-1, 2, -1, 3, 2};

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(arr[i])) {
                hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
            } else {
                hashMap.put(arr[i], 1);
            }

        }


        for (int i = 0; i < arr.length; i++) {
            if (hashMap.get(arr[i]) == 1) {
                System.out.println(arr[i]);
                return;
            }

        }

        System.out.println(0);
        return;


    }
}

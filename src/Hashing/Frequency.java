package Hashing;

import java.util.HashMap;

public class Frequency {

    public static void main(String[] args) {

        int arr[] = {10, 20, 20, 10, 10, 20, 5, 20};

        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for(int i = 0; i < arr.length; i++)
        {
            if(hashMap.containsKey(arr[i]))
            {
                hashMap.put(arr[i],hashMap.get(arr[i])+1);
            }
            else
            {
                hashMap.put(arr[i],1);
            }
        }

        hashMap.entrySet().stream().forEach(System.out::println);
    }
}

package Hashing;

import java.util.HashSet;
import java.util.Set;

public class CountDistinct {

    public static void main(String[] args) {

        int[] arr = {6, 10, 5, 4, 9, 120, 4, 6, 10};

        Set<Integer> set = new HashSet<>();

        for(int i = 0 ; i < arr.length; i++)
        {
            set.add(arr[i]);
        }

        System.out.println(set.size());


    }
}

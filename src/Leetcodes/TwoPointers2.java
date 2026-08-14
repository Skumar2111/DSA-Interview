package Leetcodes;

public class TwoPointers2 {

    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        System.out.println(twoSum(numbers, target));
    }

        public static int[] twoSum(int[] numbers, int target) {

            int first = 0;
            int last = numbers.length - 1;

            while(numbers[first] + numbers[last] != target)
            {
                if(numbers[first] + numbers[last] < target)
                    first++;

                else
                    last--;
            }

            return new int[] {first+1, last+1};

        }

}

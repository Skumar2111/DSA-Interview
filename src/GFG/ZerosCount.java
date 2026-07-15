package GFG;

public class ZerosCount {

    public static void main(String[] args) {

        int[] arr =  {1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0};
        System.out.println(countZeroes(arr));
    }


        public static int countZeroes(int[] arr) {
            int count =0;
            // code here
            for(int i = arr.length -1 ; i >= 0 ; i--)
            {
                if(arr[i] == 0)
                {
                    count++;
                }

                if(arr[i] == 1)
                {

                    return count;
                }
            }

            return count;
        }
    };


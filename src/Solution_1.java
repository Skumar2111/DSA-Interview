class Solution_1 {
    public static void main(String[] args) {

        int[] arr = {1,2,4,3,5,0,0,0};

        arr = pushZerosToEnd(arr);
        for(int i = 0 ; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }


  public static  int[] pushZerosToEnd(int[] arr) {
        // code here
        int count = 0;

        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] != 0)
            {
                arr[count++] = arr[i];
            }
        }

        while(count < arr.length)
        {
            arr[count++] = 0;
        }

        return arr;
    }



}
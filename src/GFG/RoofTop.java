package GFG;

class RoofTop {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 2};

        System.out.println(maxStep(arr));
    }
    public static int maxStep(int[] arr) {
        // code here
        int curr = 0;
        int max = 0;

        for(int i = 0 ; i < arr.length -1 ; i++)
        {

            if(arr[i] < arr[i+1])
            {
                curr ++;
                max = Math.max(max, curr);
            }
            else if (arr[i] >= arr[i+1])
            {
                curr = 0;
            }

        }

        return max;
    }
}
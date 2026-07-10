public class CheckPallindrome {

    public static void main(String[] args) {

        String string = "ABBA";

        char[] chars = string.toCharArray();

        int left = 0;
        int right = chars.length-1;

        while(left <= right)
        {
            if(chars[left] == chars[right])
            {
                left++;
                right--;

                continue;
            }
            else
            {
                System.out.println("Not Palindrome");
                return;
            }
        }

        System.out.println("Is Palindrome");
        return;

    }
}

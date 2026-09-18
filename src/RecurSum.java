public class RecurSum {

    public static void main(String[] args) {

        String name = "Falana";
        sum(name.toCharArray(),0);
    }

    private static void sum(char[] name,int index) {

        if(name == null || index >= name.length)
        {
            return;
        }

        sum(name,index+1);
        System.out.println(name[index]);

    }


}

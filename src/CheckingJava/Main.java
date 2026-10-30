package CheckingJava;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("Mah");
        Student student1 = new Student("Mah");

        System.out.println(student==student1);

        System.out.println(student.equals(student1));

        System.out.println(student.hashCode());
        System.out.println(student1.hashCode());

    }


}

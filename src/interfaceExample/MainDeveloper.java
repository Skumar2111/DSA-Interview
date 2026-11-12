package interfaceExample;

public class MainDeveloper {

    public static void main(String[] args) {

        Developer developer = new Developer();

        developer.setup();
        Employee.callStatic();

        developer.myInterface();
    }
}

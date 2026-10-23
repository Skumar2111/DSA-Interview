package Stream;

public class Employees {

    int id;
    int salary;

    public Employees(int id, int salary) {
        this.id = id;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "id=" + id +
                ", salary=" + salary +
                '}';
    }
}

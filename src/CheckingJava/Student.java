package CheckingJava;

import java.util.Objects;

public class Student extends Person{

    String name;
    public Student(String name) {
        super(name);
        this.name  = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}

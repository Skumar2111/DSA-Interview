package EmployeeManagement;

import java.util.Random;

public class Employee {

    int id;
    String name;
    String department;
    int age;

    public Employee(String name, String department, int age) {
        setUpId();
        this.name = name;
        this.department = department;
        this.age = age;
    }

    private void setUpId() {
        Random random = new Random();
        this.id = random.nextInt(1000);
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }



    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                '}';
    }
}

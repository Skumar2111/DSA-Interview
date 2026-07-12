package Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class TestReflection {

    public static void main(String[] args) {
        try {
            Class<?> classObj = Class.forName("Reflection.Student");

            Method[] methods = classObj.getMethods();
            Student student = (Student)
                    classObj.getConstructor(String.class, Integer.class)
                            .newInstance("Sushant", 1);

            Method method = classObj.getDeclaredMethod("setRoll_number",Integer.class);

            Method setNameMethod = classObj.getDeclaredMethod("setName",String.class);
            setNameMethod.setAccessible(true);

            Method processStudent = classObj.getDeclaredMethod("processStudent");


            setNameMethod.invoke(student,"Sush");
            method.invoke(student,10);
            String myProcess = (String) processStudent.invoke(student);





            for(int i = 0 ; i < methods.length ; i++)
            {

                System.out.println(methods[i]);
            }
            System.out.println("\n\n\n");
            System.out.println("After the reflection" +student);

            System.out.println("Printing process result  : " +myProcess);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }



}



class Student
{
    String name;
    Integer roll_number;

    public Student(String name, Integer roll_number) {
        this.name = name;
        this.roll_number = roll_number;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getRoll_number() {
        return roll_number;
    }

    public void setRoll_number(Integer roll_number) {
        System.out.println("I am setting roll number : " +roll_number);
        this.roll_number = roll_number;
    }


    public String processStudent()
    {
        return this.name+" - "+this.roll_number;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll_number=" + roll_number +
                '}';
    }
}
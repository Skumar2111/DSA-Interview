package Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CarReflection {

    public static void main(String[] args) {

        var executor = Executors.newFixedThreadPool(2);

        Runnable runnable = () ->
        {
            try {
                Class<?> carClass = Class.forName("Reflection.Car");
                Method[] methods = carClass.getMethods();

                Car car = (Car) carClass.getConstructor(String.class,Integer.class).newInstance("Creta",1000);

                Method getCar = carClass.getDeclaredMethod("getCar");

                String carDetails = (String) getCar.invoke(car);

                System.out.println("Car details : "+carDetails);

                System.out.println("From Thread :" + Thread.currentThread());


            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        };

        Runnable runnable_1 = () ->
        {
            try {
                Class<?> carClass = Class.forName("Reflection.Car");
                Method[] methods = carClass.getMethods();

                Car car = (Car) carClass.getConstructor(String.class,Integer.class).newInstance("Toyota",1500);

                Method getCar = carClass.getDeclaredMethod("getCar");

                String carDetails = (String) getCar.invoke(car);

                System.out.println("Car details : "+carDetails);
                System.out.println("From Thread :" + Thread.currentThread());


            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        };

        Future<?> future = executor.submit(runnable);

        executor.execute(runnable_1);

        try {
            future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        finally {
            executor.shutdown();
        }


    }

}

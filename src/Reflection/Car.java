package Reflection;

public class Car {

    String name;
    int enginePower;

    public Car(String name, Integer enginePower) {
        this.name = name;
        this.enginePower = enginePower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public String  getCar()
    {
        return this.name+"-"+this.enginePower;
    }
}

package Generics;

public class TestGenerics {


    public static void main(String[] args) {

        Box<Integer> insideBox = new Box<>();
        insideBox.setValue(10);

        Box<String> insideStringBox = new Box<>();
        insideStringBox.setValue("Sushant");

        System.out.println("Integer boxed value : "+insideBox.getValue());
        System.out.println("String boxed value : "+insideStringBox.getValue());


    }
}


class Box<T>
{
    T value;

    public void setValue(T value) {
        this.value = value;
    }

    T getValue()
    {
        return value;
    }

}
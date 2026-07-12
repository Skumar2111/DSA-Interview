package Generics;

public class TestGenerics {


    public static void main(String[] args) {

        Box<String> insideBox = new Box<>();
        insideBox.setValue("String");

        BoxPair<Integer,Integer> boxPair = new BoxPair<>(10,10);

        System.out.println("Box pair key : " +boxPair.getKey());
        System.out.println("Box pair value :" +boxPair.getValue());

        Box<String> insideStringBox = new Box<>();
        insideStringBox.setValue("Sushant");

        System.out.println("Integer boxed value : "+insideBox.getValue());
        System.out.println("String boxed value : "+insideStringBox.getValue());

    }
}


class Box<T extends String>
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



class BoxPair<K,V>
{
    K key;
    V value;

    public BoxPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
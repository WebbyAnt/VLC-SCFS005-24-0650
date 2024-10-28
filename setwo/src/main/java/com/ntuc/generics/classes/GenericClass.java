package com.ntuc.generics.classes;

// Generic class with One type
public class GenericClass<T> {
    private T info;

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

}

// Generic Class with 2 types
class MyGeneric<K, V> {
    private K k;
    private V v;

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    @Override
    public String toString() {
        return k + " - " + v;
    }

}

class TestGeneric {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // implement the Generic Class
        GenericClass<Integer> gi = new GenericClass<>();
        GenericClass<String> gs = new GenericClass<>();

        gi.setInfo(100);
        gs.setInfo("Test");

        System.out.println(gi.getInfo());
        System.out.println(gs.getInfo());

        // implement the MyGeneric Class
        MyGeneric<Integer, String> pairs = new MyGeneric<>();
        pairs.setK(100);
        pairs.setV("Apple");
        System.out.println(pairs.getK() + " - " + pairs.getV());

        // creating an array of a MyGeneric Class
        MyGeneric<Integer, String>[] pairList = new MyGeneric[3];
        // instantiating the MyGeneric class in all 3 array elements
        pairList[0] = new MyGeneric<Integer, String>();
        pairList[1] = new MyGeneric<Integer, String>();
        pairList[2] = new MyGeneric<Integer, String>();

        // populating the array element at index 0
        pairList[0].setK(1);
        pairList[0].setV("Laptop");

        // populating the array element at index 1
        pairList[1].setK(2);
        pairList[1].setV("Charger");

        // populating the array element at index 2
        pairList[2].setK(3);
        pairList[2].setV("Airpods");

        // printing the list of items in list
        for (MyGeneric<Integer, String> myGeneric : pairList) {
            System.out.println(myGeneric);
        }
    }
}

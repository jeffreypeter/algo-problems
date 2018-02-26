package cci.oop;


/**
 * Created by jeffr on 08-10-2017.
 */
public class CircularArray<T> {
    private T[] items;
    private int head = 0;
    public CircularArray(int size) {
        items = (T[]) new Object[size];
    }
}

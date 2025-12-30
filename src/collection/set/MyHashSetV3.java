package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV3<E> implements MySet<E>{
    private static final int DEFAULT_INITIAL_CAPACITY = 10;
    private LinkedList<E>[] elementData;
    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV3() {
        initBuckets();
    }

    public MyHashSetV3(int capacity) {
        this.capacity = capacity;
        initBuckets();
    }

    private void initBuckets(){
        elementData = new LinkedList[capacity];
        for (int i = 0; i < elementData.length; i++) {
            elementData[i] = new LinkedList<>();
        }
        System.out.println("elementData = " + Arrays.toString(elementData));
    }

    private int hashIndex(E value) {
        return Math.abs(value.hashCode()) % capacity;
    }

    public boolean add(E value) {
        int index = hashIndex(value);
        LinkedList<E> bucket = elementData[index];
        if(bucket.contains(value)){
            return false;
        }
        bucket.add(value);
        size++;
        return true;
    }

    public boolean remove(E value){
        int index = hashIndex(value);
        LinkedList<E> bucket = elementData[index];
        boolean remove = bucket.remove(value);// type caution
        if(!remove){
            return false;
        }
        size--;
        return true;
    }

    public boolean contains(E value) {
        int index = hashIndex(value);
        LinkedList<E> bucket = elementData[index];
        return bucket.contains(value);
    }

    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV3{" +
                "elementData=" + Arrays.toString(elementData) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}

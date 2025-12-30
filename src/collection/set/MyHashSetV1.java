package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV1 {
    private static final int DEFAULT_INITIAL_CAPACITY = 10;
    private LinkedList<Integer>[] elementData;
    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV1() {
        initBuckets();
    }

    public MyHashSetV1(int capacity) {
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

    private int hashIndex(int value) {
        return value % capacity;
    }

    public boolean add(int value) {
        int index = hashIndex(value);
        LinkedList<Integer> bucket = elementData[index];
        if(bucket.contains(value)){
            return false;
        }
        bucket.add(value);
        size++;
        return true;
    }

    public boolean remove(int value){
        int index = hashIndex(value);
        LinkedList<Integer> bucket = elementData[index];
        boolean remove = bucket.remove(Integer.valueOf(value));// type caution
        if(!remove){
            return false;
        }
        size--;
        return true;
    }

    public boolean contains(int value) {
        int index = hashIndex(value);
        LinkedList<Integer> bucket = elementData[index];
        return bucket.contains(value);
    }

    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV0{" +
                "elementData=" + Arrays.toString(elementData) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}

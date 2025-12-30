package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV2 {
    private static final int DEFAULT_INITIAL_CAPACITY = 10;
    private LinkedList<Object>[] elementData;
    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV2() {
        initBuckets();
    }

    public MyHashSetV2(int capacity) {
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

    private int hashIndex(Object value) {
        return Math.abs(value.hashCode()) % capacity;
    }

    public boolean add(Object value) {
        int index = hashIndex(value);
        LinkedList<Object> bucket = elementData[index];
        if(bucket.contains(value)){
            return false;
        }
        bucket.add(value);
        size++;
        return true;
    }

    public boolean remove(Object value){
        int index = hashIndex(value);
        LinkedList<Object> bucket = elementData[index];
        boolean remove = bucket.remove(value);// type caution
        if(!remove){
            return false;
        }
        size--;
        return true;
    }

    public boolean contains(Object value) {
        int index = hashIndex(value);
        LinkedList<Object> bucket = elementData[index];
        return bucket.contains(value);
    }

    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV2{" +
                "elementData=" + Arrays.toString(elementData) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}

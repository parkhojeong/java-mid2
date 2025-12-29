package collection.array;

import java.util.Arrays;

public class MyArrayListV3 {
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size;

    public MyArrayListV3() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV3(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public void add(Object e) {
        if (size == elementData.length) {
            grow();
        }
        elementData[size++] = e;
    }

    public void add(int index, Object e) {
        if (size == elementData.length) {
            grow();
        }
        shiftRightFrom(index);
        elementData[index] = e;
        size++;
    }

    private void shiftRightFrom(int index) {
        for (int i = size - 1; i >= index; i--) {
            elementData[i + 1] = elementData[i];
        }
    }

    public Object remove(int index) {
        Object oldValue = elementData[index];
        shiftLeftFrom(index);
        elementData[--size] = null;

        return oldValue;
    }

    private void shiftLeftFrom(int index) {
        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
    }

    private void grow() {
        elementData = Arrays.copyOf(elementData, elementData.length * 2);
    }

    public Object get(int index) {
        return elementData[index];
    }

    public Object set(int index, Object e) {
        Object oldValue = get(index);
        elementData[index] = e;
        return oldValue;
    }

    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (elementData[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, size)) +
                " size=" + size +
                ", capacity=" + elementData.length;
    }
}

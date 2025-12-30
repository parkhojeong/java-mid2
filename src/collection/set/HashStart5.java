package collection.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class HashStart5 {
    static final int CAPACITY = 5;

    public static void main(String[] args) {
        List<Integer>[] buckets = new LinkedList[CAPACITY];
        System.out.println("buckets = " + Arrays.toString(buckets));
        for (int i = 0; i < CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }
        System.out.println("buckets = " + Arrays.toString(buckets));
        add(buckets, 1);
        add(buckets, 2);
        add(buckets, 5);
        add(buckets, 8);
        add(buckets, 14);
        add(buckets, 99);
        add(buckets, 9);
        System.out.println("buckets = " + Arrays.toString(buckets));

        // search: O(1)
        int searchValue = 8;
        boolean result = get(buckets, searchValue);
        System.out.println("result = " + result);

    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }

    static boolean get(List<Integer>[] list, int value) {
        int index = hashIndex(value); // O(1)
        List<Integer> bucket = list[index]; // O(1)
        return bucket.contains(value); // O(n)
    }

    static void add(List<Integer>[] list, int value) {
        List<Integer> bucket = list[(hashIndex(value))]; // O(1)
        if( bucket.contains(value)){ // O(n)
            return;
        }
        bucket.add(value);
    }
}

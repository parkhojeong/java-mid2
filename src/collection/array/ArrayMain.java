package collection.array;

import java.util.Arrays;

public class ArrayMain {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        System.out.println(Arrays.toString(arr));

        addFirst(arr, 3);
        System.out.println(Arrays.toString(arr));

        addAtIndex(arr, 2, 4);
        System.out.println(Arrays.toString(arr));

        addLast(arr, 5);
        System.out.println(Arrays.toString(arr));
    }

    static void addLast(int[] arr, int value) {
        arr[arr.length - 1] = value;
    }

    static void addFirst(int[] arr, int value) {
        for (int i = arr.length - 2; i >= 1; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = value;
    }

    static void addAtIndex(int[] arr, int index, int value) {
        for (int i = arr.length - 2; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = value;
    }
}

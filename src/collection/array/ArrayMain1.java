package collection.array;

import java.util.Arrays;

public class ArrayMain1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println("==index input: O(1)");
        arr[0] = 1;
        System.out.println(Arrays.toString(arr));

        System.out.println("==index change: O(1)==");
        arr[0] = 2;
        System.out.println(Arrays.toString(arr));

        System.out.println("==index select: O(1)==");
        System.out.println(arr[0]);

        System.out.println("==array search: O(n)==");
        int value = 10;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                System.out.println(i);
                break;
            }
        }
    }
}

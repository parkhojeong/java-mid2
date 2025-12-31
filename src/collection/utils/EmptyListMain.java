package collection.utils;

import java.util.*;

public class EmptyListMain {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        List<Integer> list3 = Collections.emptyList(); // java 5
        List<Integer> list4 = List.of(); // java 9. recommended

        System.out.println("list3.getClass() = " + list3.getClass());
        System.out.println("list4.getClass() = " + list4.getClass());

        int[] arr = new int[1_000_000_000];
        Arrays.asList(arr); // fixed length, set possible
        List.of(arr);

    }

}

package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JavaListPerformanceTest {
    public static void main(String[] args) {
        int size = 50_000;
        System.out.println("==ArrayList add==");
        addFirst(new ArrayList<>(), size);
        addMid(new ArrayList<>(), size); // find O(1), shift O(n)
        ArrayList<Integer> arrayList = new ArrayList<>();
        addLast(arrayList, size); // find O(1), add O(1), grow O(n)

        int loop = 10_000;
        System.out.println("==ArrayList search==");
        getIndex(arrayList, loop, 0);
        getIndex(arrayList, loop, size/2);
        getIndex(arrayList, loop, size-1);

        System.out.println("==ArrayList search findValue==");
        search(arrayList, loop, 0);
        search(arrayList, loop, size/2);
        search(arrayList, loop, size-1);


        System.out.println("==LinkedList add==");
        addFirst(new LinkedList<>(), size);
        addMid(new LinkedList<>(), size); // find O(n), add O(1)
        LinkedList<Integer> linkedList = new LinkedList<>();
        addLast(linkedList, size); // find O(n), add O(1)

        System.out.println("==LinkedList search==");
        getIndex(linkedList, loop, 0);
        getIndex(linkedList, loop, size/2);
        getIndex(linkedList, loop, size-1);

        System.out.println("==LinkedList search findValue==");
        search(linkedList, loop, 0);
        search(linkedList, loop, size/2);
        search(linkedList, loop, size-1);

    }

    private static void addFirst(List<Integer> list, int size) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        long end = System.currentTimeMillis();
        System.out.print("[addFirst]");
        System.out.println("size = " + size + ", time = " + (end - start) + " ms");
    }

    private static void addMid(List<Integer> list, int size) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i/2, i);
        }
        long end = System.currentTimeMillis();
        System.out.print("[addMid] ");
        System.out.println("size = " + size + ", time = " + (end - start) + " ms");
    }

    private static void addLast(List<Integer> list, int size) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i, i);
        }
        long end = System.currentTimeMillis();
        System.out.print("[addLast] ");
        System.out.println("size = " + size + ", time = " + (end - start) + " ms");
    }

    private static void getIndex(List<Integer> list, int loop, int index) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.get(index);
        }
        long end = System.currentTimeMillis();
        System.out.print("[getIndex] ");
        System.out.println("index = " + index + ", loop = " + loop + ", time = " + (end - start) + " ms");
    }

    private static void search(List<Integer> list, int loop, int findValue) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.indexOf(findValue);
        }
        long end = System.currentTimeMillis();
        System.out.print("[search] ");
        System.out.println("findValue = " + findValue + ", loop = " + loop + ", time = " + (end - start) + " ms");
    }

}

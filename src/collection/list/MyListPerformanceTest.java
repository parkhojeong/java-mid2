package collection.list;

public class MyListPerformanceTest {
    public static void main(String[] args) {
        int size = 50_000;
        System.out.println("==MyArrayList add==");
        addFirst(new MyArrayList<>(), size);
        addMid(new MyArrayList<>(), size); // find O(1), shift O(n)
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        addLast(arrayList, size); // find O(1), add O(1), grow O(n)

        int loop = 10_000;
        System.out.println("==MyArrayList search==");
        getIndex(arrayList, loop, 0);
        getIndex(arrayList, loop, size/2);
        getIndex(arrayList, loop, size-1);

        System.out.println("==MyArrayList search findValue==");
        search(arrayList, loop, 0);
        search(arrayList, loop, size/2);
        search(arrayList, loop, size-1);


        System.out.println("==MyLinkedList add==");
        addFirst(new MyLinkedList<>(), size);
        addMid(new MyLinkedList<>(), size); // find O(n), add O(1)
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        addLast(linkedList, size); // find O(n), add O(1)

        System.out.println("==MyLinkedList search==");
        getIndex(linkedList, loop, 0);
        getIndex(linkedList, loop, size/2);
        getIndex(linkedList, loop, size-1);

        System.out.println("==MyLinkedList search findValue==");
        search(linkedList, loop, 0);
        search(linkedList, loop, size/2);
        search(linkedList, loop, size-1);

    }

    private static void addFirst(MyList<Integer> list, int size) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        long end = System.currentTimeMillis();
        System.out.print("[addFirst]");
        System.out.println("size = " + size + ", time = " + (end - start) + " ms");
    }

    private static void addMid(MyList<Integer> list, int size) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i/2, i);
        }
        long end = System.currentTimeMillis();
        System.out.print("[addMid] ");
        System.out.println("size = " + size + ", time = " + (end - start) + " ms");
    }

    private static void addLast(MyList<Integer> list, int size) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i, i);
        }
        long end = System.currentTimeMillis();
        System.out.print("[addLast] ");
        System.out.println("size = " + size + ", time = " + (end - start) + " ms");
    }

    private static void getIndex(MyList<Integer> list, int loop, int index) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.get(index);
        }
        long end = System.currentTimeMillis();
        System.out.print("[getIndex] ");
        System.out.println("index" + index + ", loop = " + loop + ", time = " + (end - start) + " ms");
    }

    private static void search(MyList<Integer> list, int loop, int findValue) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.indexOf(findValue);
        }
        long end = System.currentTimeMillis();
        System.out.print("[search] ");
        System.out.println("findValue" + findValue + ", loop = " + loop + ", time = " + (end - start) + " ms");
    }

}

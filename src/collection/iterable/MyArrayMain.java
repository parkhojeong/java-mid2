package collection.iterable;

import java.util.Iterator;

public class MyArrayMain {
    public static void main(String[] args) {
        MyArray myArray = new MyArray(new int[]{1, 2, 3, 4, 5});
        Iterator<Integer> iterator = myArray.iterator();
        System.out.println("== iterator ==");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("== enhanced for loop ==");
        for (int value : myArray) {
            System.out.println("value = " + value);
        }
    }
}

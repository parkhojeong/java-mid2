package collection.iterable;

import java.util.*;

public class JavaIterableMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        print(list.iterator());

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        print(set.iterator());

        forEach(list);
        forEach(set);

    }

    static void print(Iterator<Integer> iterator) {
        System.out.println("iterator = " + iterator.getClass().getName());
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    static void forEach(Iterable<Integer> iterable) {
        System.out.println("iterable = " + iterable.getClass());
        for (Integer value : iterable) {
            System.out.println("value = " + value);
        }
    }
}

package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableMain {
    public static void main(String[] args) {
        List<Integer> immutableList = List.of(1, 2, 3);

        ArrayList<Integer> mutableList = new ArrayList<>(immutableList);
        mutableList.add(4);
        System.out.println("mutableList = " + mutableList);
        System.out.println("mutableList.getClass() = " + mutableList.getClass());

        List<Integer> unmodifiableList = Collections.unmodifiableList(mutableList);
        // UnsupportedOperationException
        // unmodifiableList.add(5);
        System.out.println("unmodifiableList = " + unmodifiableList);
        System.out.println("unmodifiableList.getClass() = " + unmodifiableList.getClass());
    }
}

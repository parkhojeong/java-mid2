package collection.set.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueNamesTest1 {
    public static void main(String[] args) {
        Integer[] inputArray = {30, 20, 20, 10, 10};

        Set<Integer> integerSet = new HashSet<>(Arrays.asList(inputArray));
        for (Integer integer : integerSet) {
            System.out.println(integer);
        }

    }
}

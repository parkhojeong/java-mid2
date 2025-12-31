package collection.set.test;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueNamesTest2 {
    public static void main(String[] args) {
        Integer[] inputArray = {30, 20, 20, 10, 10};

        Set<Integer> integerSet = new LinkedHashSet<>(List.of(inputArray));
        for (Integer integer : integerSet) {
            System.out.println(integer);
        }
    }
}

package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class CommonKeyValueSum2 {
    public static void main(String[] args) {
        // immutable map
        Map<String, Integer> map1 = Map.of("A", 1, "B", 2, "C", 3);
        Map<String, Integer> map2 = Map.of("B", 4, "C", 5, "D", 6);

        Map<String, Integer> result = new HashMap<>();
        for (String string : map1.keySet()) {
            if(map2.containsKey(string)) {
                result.put(string, map1.get(string) + map2.get(string));
            }
        }

        System.out.println(result);
    }
}

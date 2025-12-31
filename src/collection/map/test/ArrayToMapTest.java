package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMapTest {
    public static void main(String[] args) {
        String[][] productArr = {{"JAVA", "10000"}, {"SPRING", "20000"}, {"JPA", "30000"}};
        Map<String, Integer> map = new HashMap<>();

        for (String[] strings : productArr) {
            map.put(strings[0], Integer.valueOf(strings[1]));
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

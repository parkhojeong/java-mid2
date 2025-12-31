package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain1 {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        studentMap.put("studentA", 90);
        studentMap.put("studentB", 90);
        studentMap.put("studentC", 100);
        studentMap.put("studentD", 80);

        System.out.println(studentMap);

        System.out.println("== get ==");
        Integer result = studentMap.get("studentA");
        System.out.println("result = " + result);

        System.out.println("== keySet ==");
        Set<String> keySet = studentMap.keySet();
        System.out.println("keySet = " + keySet);
        for (String key : keySet) {
            Integer value = studentMap.get(key);
            System.out.println(key + " : " + value);
        }

        System.out.println("== entrySet ==");
        Set<Map.Entry<String, Integer>> entries = studentMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("== values ==");
        Collection<Integer> values = studentMap.values();
        for (Integer value : values) {
            System.out.println("value = " + value);
        }
    }
}

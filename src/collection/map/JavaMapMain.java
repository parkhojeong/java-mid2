package collection.map;

import java.util.*;

public class JavaMapMain {
    public static void main(String[] args) {
        run(new HashMap<>());
        run(new LinkedHashMap<>());
        run(new TreeMap<>());
    }

    private static void run(Map<String, Integer> map) {
        System.out.println("map = " + map);
        map.put("student4", 10);
        map.put("student3", 20);
        map.put("student2", 30);
        map.put("student1", 40);

        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while(iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + " : " + map.get(key));
        }
        System.out.println();

    }

}

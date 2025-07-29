import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;
import java.util.Iterator;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        demonstrateMap(hashMap, "HashMap");

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        demonstrateMap(linkedHashMap, "LinkedHashMap");

        Map<String, Integer> treeMap = new TreeMap<>();
        demonstrateMap(treeMap, "TreeMap");
    }

    private static void demonstrateMap(Map<String, Integer> map, String mapType) {
        System.out.println("Demonstrating " + mapType);

        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);

        System.out.println("Value for key 'Two': " + map.get("Two"));

        map.remove("Three");

        System.out.println("Map contains key 'Three': " + map.containsKey("Three"));

        System.out.println("Map contains value 3: " + map.containsValue(3));

        System.out.println("Size of the map: " + map.size());

        System.out.println("Map is empty: " + map.isEmpty());

        System.out.println("Using entrySet() and for-each loop:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("Using keySet() and for-each loop:");
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

        System.out.println("Using values() and for-each loop:");
        for (Integer value : map.values()) {
            System.out.println("Value: " + value);
        }

        System.out.println("Using Iterator and entrySet():");
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("Using Java 8 forEach method:");
        map.forEach((key, value) -> System.out.println(key + " -> " + value));

        System.out.println();
    }
}

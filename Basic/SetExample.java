import java.util.*;

public class SetExample {

    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        performSetOperations("HashSet", hashSet);

        Set<String> linkedHashSet = new LinkedHashSet<>();
        performSetOperations("LinkedHashSet", linkedHashSet);

        Set<String> treeSet = new TreeSet<>();
        performSetOperations("TreeSet", treeSet);
    }

    public static void performSetOperations(String setType, Set<String> set) {
        System.out.println("Performing operations on " + setType);

        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        System.out.println("After adding elements: " + set);

        set.remove("Banana");
        System.out.println("After removing 'Banana': " + set);

        boolean containsApple = set.contains("Apple");
        System.out.println("Contains 'Apple': " + containsApple);

        int size = set.size();
        System.out.println("Size of the set: " + size);

        boolean isEmpty = set.isEmpty();
        System.out.println("Is the set empty: " + isEmpty);

        set.clear();
        System.out.println("After clearing the set, is empty: " + set.isEmpty());

        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        System.out.print("Traversal using Iterator: ");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        System.out.print("Traversal using for-each loop: ");
        for (String element : set) {
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.print("Traversal using Streams: ");
        set.stream().forEach(element -> System.out.print(element + " "));
        System.out.println();

        System.out.println();
    }
}


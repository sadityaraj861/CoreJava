package CollectionFramework;

import java.util.*;

public class FrequencyUsingHashmap {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();


        for (int num : array) {
            // Update frequency or initialize if not present
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Display the frequency of each element
        for (int key : frequencyMap.keySet()) {
            System.out.println("Element: " + key + " Frequency: " + frequencyMap.get(key));
        }
    }
}
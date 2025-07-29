package DSA;

import java.util.Random;
import java.util.Scanner;

public class QuickSortTimeComparison {

    // Method to perform quicksort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Partition method for quicksort
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // index of smaller element
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    // Method to generate an array with random elements
    public static int[] generateRandomArray(int n) {
        Random rand = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(10000); // generate numbers between 0 and 9999
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of elements to sort
        System.out.println("Enter the number of elements to sort: ");
        int n = scanner.nextInt();

        int[] arr = generateRandomArray(n);

        // Display unsorted array
        System.out.println("Unsorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Record the start time of the sorting process
        long startTime = System.nanoTime();

        // Perform quicksort
        quickSort(arr, 0, arr.length - 1);

        // Record the end time of the sorting process
        long endTime = System.nanoTime();

        // Calculate the time taken in milliseconds
        long timeTaken = (endTime - startTime) / 1000000;

        // Display the sorted array
        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Display the time taken to sort
        System.out.println("Time taken to sort the array: " + timeTaken + " ms");

        scanner.close();
    }
}

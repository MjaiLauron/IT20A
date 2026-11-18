
package sortingalgorithms_activity;

import java.util.Arrays;

public class SortingAlgorithms {

    // Bubble Sort
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
    }

    // Selection Sort
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    // Insertion Sort
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        int[] originalArray = {45, 12, 89, 3, 27, 64, 8, 51, 19, 36};

        int[] bubbleArray = originalArray.clone();
        int[] selectionArray = originalArray.clone();
        int[] insertionArray = originalArray.clone();

        System.out.println("Original Array: "
                + Arrays.toString(originalArray));

        bubbleSort(bubbleArray);
        System.out.println("Bubble Sort: "
                + Arrays.toString(bubbleArray));

        selectionSort(selectionArray);
        System.out.println("Selection Sort: "
                + Arrays.toString(selectionArray));

        insertionSort(insertionArray);
        System.out.println("Insertion Sort: "
                + Arrays.toString(insertionArray));
    }
}

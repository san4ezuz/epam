package com.company.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *  Main class for Binary Search and sorting algoritms
 */
public class Main {

    public static void main(String[] args) {
        int[] arrayForBinary = {1, 5, 22, 31, 153};
        System.out.println("Input element to find: ");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int count = 0;
            try {
                count = Integer.parseInt(reader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
            BinarySearch binarySearch = new BinarySearch();

            System.out.println("Binary Search: " + binarySearch.binarySearch(count, arrayForBinary));
        } catch (IOException e) {
            e.printStackTrace();
        }
        int[] arrayForBubbleSort = {10, 3, 7, 56, 19, 23, 8, 14, 17, 1};
        int[] arrayForMergeSort = {72, 11, 23, 17, 32, 22, 6, 2, 5, 11};
        int[] arrayForRadixSort = {8, 2, 1, 42, 21, 23, 3, 9, 13, 28};
        int[] arrayForQuickSort = {4, 8, 15, 23, 46, 23, 8, 14, 17, 1};

        //BubbleSort
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(arrayForBubbleSort);
        System.out.println("Bubble Sort:" + Arrays.toString(arrayForBubbleSort));
        //MergeSort
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(arrayForMergeSort);
        System.out.println("Merge Sort: " + Arrays.toString(arrayForMergeSort));
        //RadixSort
        RadixSort radixSort = new RadixSort();
        radixSort.sort(arrayForRadixSort);
        System.out.println("Radix Sort: " + Arrays.toString(arrayForRadixSort));
        //QuickSort
        QuickSort quickSort = new QuickSort();
        quickSort.sort(arrayForQuickSort, 0, arrayForQuickSort.length - 1);
        System.out.println("QuickSort: " + Arrays.toString(arrayForQuickSort));
    }
}

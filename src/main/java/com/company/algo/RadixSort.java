package com.company.algo;

import java.util.Arrays;

/**
 * Radix sort
 * Is a non-comparative integer sorting algorithm that sorts data with integer keys by grouping keys
 * by the individual digits which share the same significant position and value.
 */
public class RadixSort {

    void sort(int[] inputArray) {
        radixSort(inputArray);
    }

    private void radixSort(int[] inputArray) {
        int maxNumber = getMaxNumber(inputArray);
        for (int rank = 1; maxNumber / rank > 0; rank *= 10) {
            countSort(inputArray, rank);
        }
    }

    private void countSort(int[] inputArray, int rank) {
        int outputArray[] = new int[inputArray.length];
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);
        for (i = 0; i < inputArray.length; i++) {
            count[(inputArray[i] / rank) % 10]++;
        }
        for (i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }
        for (i = inputArray.length - 1; i >= 0; i--) {
            outputArray[count[(inputArray[i] / rank) % 10] - 1] = inputArray[i];
            count[(inputArray[i] / rank) % 10]--;
        }
        for (i = 0; i < inputArray.length; i++) {
            inputArray[i] = outputArray[i];
        }
    }

    private int getMaxNumber(int[] inputArray) {
        int maxNumber = inputArray[0];
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] > maxNumber) {
                maxNumber = inputArray[i];
            }
        }
        return maxNumber;
    }
}
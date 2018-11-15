package com.company.algo;

/**
 * Bubble sort
 * Is a simple sorting algorithm that repeatedly steps through the list, compares adjacent pairs and swaps them
 * if they are in the wrong order. The pass through the list is repeated until the list is sorted.
 */
public class BubbleSort {

    void sort(int[] inputArray) {
        while (true) {
            boolean isSwapped = false;
            for (int i = 0; i < inputArray.length - 1; i++) {
                if (inputArray[i] > inputArray[i + 1]) {
                    int elementToSwap = inputArray[i + 1];
                    inputArray[i + 1] = inputArray[i];
                    inputArray[i] = elementToSwap;
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                return;
            }
        }
    }
}

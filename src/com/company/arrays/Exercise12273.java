package com.company.arrays;

/**
 * Exercise 12.273
 * Print word, built by even elements of every array row.
 */
public class Exercise12273 {

    public StringBuilder getWordsFromEvenElementsOfRow(char[][] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array is NULL!");
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j % 2 == 0) {
                    sb.append(array[i][j]);
                }
            }
        }
        return sb;
    }
}

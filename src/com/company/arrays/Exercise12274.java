package com.company.arrays;

/**
 * Exercise 12.274
 * Print word, built by odd elements of every column row.
 */
public class Exercise12274 {

    public StringBuilder getWordsFromOddElementsOfColumn(char[][] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array is NULL!");
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j % 2 != 0) {
                    sb.append(array[j][i]);
                }
            }
        }
        return sb;
    }
}

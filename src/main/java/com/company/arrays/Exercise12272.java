package com.company.arrays;

/**
 * Exercise 12.272
 * Print a word, built by array elements marked with stars while reading them:
 *      A) Left to right in every row
 *      B) Up to down in every column
 */
public class Exercise12272 {

    public StringBuilder getWordFromLeftToRight(char[][] array) {
        if (array.length != 5 || array[array.length - 1].length != 5) {
            throw new IllegalArgumentException("Array must be 5x5!");
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        sb.append(array[i][j]);
                    }
                } else {
                    if (j % 2 != 0) {
                        sb.append(array[i][j]);
                    }
                }
            }
        }
        return sb;
    }

    public StringBuilder getWordFromUpToDown(char[][] array) {
        if (array.length != 5 || array[array.length - 1].length != 5) {
            throw new IllegalArgumentException("Array must be 5x5!");
        }
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length; i++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    sb.append(array[i][j]);
                } else if (i % 2 > 0 && j % 2 > 0) {
                    sb.append(array[i][j]);
                }
            }
        }
        return sb;
    }
}
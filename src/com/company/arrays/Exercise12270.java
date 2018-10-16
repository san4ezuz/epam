package com.company.arrays;

/**
 * Exercise 12.270
 * Print a word built by four characters from corners of an array.
 */
public class Exercise12270 {

    public StringBuilder getCorner(char[][] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array is NULL!");
        } else if (array.length < 2 || array[0].length < 2 || array[array.length - 1].length < 2) {
            throw new IllegalArgumentException("Array is too small!");
        }

        StringBuilder sb = new StringBuilder();
        sb.append(array[0][0]);
        sb.append(array[0][array[0].length - 1]);
        sb.append(array[array.length - 1][0]);
        sb.append(array[array.length - 1][array[array.length - 1].length - 1]);
        return sb;
    }

}

package com.company.arrays;

/**
 * Exercise 12.271
 * Print a word, built by symbols of several following indexes from some line of an array.
 */
public class Exercise12271 {

    public StringBuilder getWordFromLine(char[][] array, int line, int first, int end) {
        StringBuilder sb = new StringBuilder();
        if (array == null) {
            throw new IllegalArgumentException("Array is NULL!");
        }
        if (line < 1 || first < 0 || end < 0) {
            throw new IllegalArgumentException("Wrong input!");
        }
        if (line > array.length - 1) {
            throw new IllegalArgumentException("There are not line with this index!");
        }
        if (first > array[line - 1].length || end > array[line - 1].length || end < first) {
            throw new IllegalArgumentException("Indexes are incorrect!");
        }
        for (int i = first; i <= end; i++) {
            sb.append(array[line - 1][i]);
        }
        return sb;
    }
}

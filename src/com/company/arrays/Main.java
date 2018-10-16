package com.company.arrays;

public class Main {
    public static void main(String[] args) {
        char [][] array  =
                        {{'1','2','3','4','5'},
                        {'6','7','8','9','a'},
                        {'b','c','d','e','f'},
                        {'g','h','i','j','k'},
                        {'l','m','n','o','p'}};
        System.out.println(new Exercise12270().getCorner(array));
        System.out.println(new Exercise12271().getWordFromLine(array,1,0,2));
        System.out.println(new Exercise12272().getWordFromLeftToRight(array));
        System.out.println(new Exercise12272().getWordFromUpToDown(array));
        System.out.println(new Exercise12273().getWordsFromEvenElementsOfRow(array));
        System.out.println(new Exercise12274().getWordsFromOddElementsOfColumn(array));
    }
}

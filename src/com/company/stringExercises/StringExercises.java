package com.company.stringExercises;

import java.util.Scanner;

public class StringExercises {
     private void getChars(String word) {
        System.out.println("9.13: " + word.charAt(2));
        System.out.println("9.14: " + word.charAt(word.length() - 1));
    }

    private void swapChars(String word) {
        StringBuilder sb = new StringBuilder(word);
        char first = sb.charAt(0);
        sb.setCharAt(0, sb.charAt(4));
        sb.setCharAt(4, first);
        System.out.println("9.100: " + sb.toString());
    }
    private  int getCountCharsInString(String inputString) {

        int countCharsInSubString = 0;
        int countCharsInSubStringTemp = 0;

        for (int i = 0; i < inputString.length() - 1; ++i) {
            if (inputString.charAt(i) == inputString.charAt(i + 1)) {
                countCharsInSubStringTemp += 1;
            } else if (countCharsInSubStringTemp > countCharsInSubString) {
                countCharsInSubString = countCharsInSubStringTemp;
                countCharsInSubStringTemp = 0;
            }
        }
        if (countCharsInSubStringTemp > countCharsInSubString) {
            return (countCharsInSubStringTemp + 1);
        } else return (countCharsInSubString + 1);
    }

    private void reverseString (String inputString){

        for (String retval : inputString.split(" ")) {
            StringBuilder sb = new StringBuilder(retval);
            sb.reverse();
            System.out.print(sb +" ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Input word:");
        Scanner input = new Scanner(System.in);
        String word = input.next();
        StringExercises se = new StringExercises();

        se.getChars(word);

        System.out.println("Input K:");
        int k = input.nextInt();
        input.nextLine();
        System.out.println("9.15: " + word.charAt(k - 1));

        se.swapChars(word);

        String word1 = input.nextLine();
        System.out.println("9.64: " + se.getCountCharsInString(word1));

        String str = input.nextLine();
        se.reverseString(str);
    }
}

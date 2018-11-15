package com.company.recursion;

/**
 * Exercise 10.43
 * a) Calculating sum of digits of a natural number
 * b) Calculating amount of digits of a natural number
 */
public class Exercise1043 {

    public int getSumOfDigits(int n) {
        int result = 0;
        if (n != 0) {
            result = n % 10 + getSumOfDigits(n / 10);
        }
        return result;
    }

    public int getCountOfDigits(int n) {
        if (n < 0) {
            n *= -1;
        }
        if (n < 10) {
            return 1;
        } else {
            return getCountOfDigits(n / 10) + 1;
        }
    }
}
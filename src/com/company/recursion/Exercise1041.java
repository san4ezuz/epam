package com.company.recursion;

/**
 * Exercise 10.41
 * Calculating factorial of a natural number N
 */
public class Exercise1041 {

    public int getFactorial(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("N must be positive!");
        }
        if (n == 1) {
            return 1;
        }
        return getFactorial(n - 1) * n;
    }
}

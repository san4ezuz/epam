package com.company.recursion;

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

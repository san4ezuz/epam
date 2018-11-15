package com.company.recursion;

/**
 * Exercise 10.42
 * Calculating power of natural number N
 */
public class Exercise1042 {

    public int getPower(int n, int power) {
        if (power < 0 ){
            throw new IllegalArgumentException("Power must be positive!");
        }
        if (power == 0) {
            return 1;
        }
        if (power == 1) {
            return n;
        }
        return n * getPower(n, power - 1);
    }
}
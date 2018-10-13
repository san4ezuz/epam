package com.company.recursion;

public class Exercise1042 {

    public int getPower(int n, int power) {
        if (power == 0) {
            return 1;
        }
        if (power == 1) {
            return n;
        }
        return n * getPower(n, power - 1);
    }
}

package com.company.recursion;

import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise1041Test {

    @Test
    public void testGetFactorial() {
        assertEquals(6, new Exercise1041().getFactorial(3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialForWrongInput() {
        assertEquals('0', new Exercise1041().getFactorial(-3));
    }
}
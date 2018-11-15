package com.company.recursion;

import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise1043Test {

    @Test
    public void testGetSumOfDigits() {
        assertEquals(20, new Exercise1043().getSumOfDigits(9128));
    }

    @Test
    public void testGetSumOfDigitsOfZero() {
        assertEquals(0, new Exercise1043().getSumOfDigits(0));
    }

    @Test
    public void testGetCountOfDigits() {
        assertEquals(4, new Exercise1043().getCountOfDigits(1234));
    }

}
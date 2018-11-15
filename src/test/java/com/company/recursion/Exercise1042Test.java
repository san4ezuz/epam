package com.company.recursion;

import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise1042Test {

    @Test
    public void testGetPower() {
        assertEquals(1024, new Exercise1042().getPower(2, 10));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetPowerNegative() {
        assertEquals(0, new Exercise1042().getPower(2, -2));
    }

    @Test
    public void testGetPowerZero() {
        assertEquals(1, new Exercise1042().getPower(2, 0));
    }

    @Test
    public void testGetPowerOne() {
        assertEquals(2, new Exercise1042().getPower(2, 1));
    }

}
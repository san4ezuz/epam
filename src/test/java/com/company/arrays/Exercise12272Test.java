package com.company.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise12272Test {
    private Exercise12272 test = new Exercise12272();
    private char[][] smallArray = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};
    private char [][] array  =
            {{'1','2','3','4','5'},
                    {'6','7','8','9','a'},
                    {'b','c','d','e','f'},
                    {'g','h','i','j','k'},
                    {'l','m','n','o','p'}};

    @Test
    public void testGetWordFromLeftToRight() {
        assertEquals("13579bdfhjlnp", test.getWordFromLeftToRight(array).toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetWordFromLeftToRightFromIncorrectMatrix() {
        assertEquals(null, test.getWordFromLeftToRight(smallArray).toString());
    }

    @Test
    public void testGetWordFromUpToDown() {
        assertEquals("1bl7h3dn9j5fp", test.getWordFromUpToDown(array).toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetWordFromUpToDownFromIncorrectMatrix() {
        assertEquals(null, test.getWordFromUpToDown(smallArray).toString());
    }
}
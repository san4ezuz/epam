package test.com.company.arrays;

import com.company.arrays.Exercise12273;
import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise12273Test {
    private Exercise12273 test = new Exercise12273();
    private char[][] array = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};

    @Test
    public void testGetWordsFromEvenElementsOfRow() {
        assertEquals("13568", test.getWordsFromEvenElementsOfRow(array).toString());
    }

    @Test (expected = IllegalArgumentException.class)
    public void testGetWordsFromEvenElementsOfNull(){
        assertEquals(null,test.getWordsFromEvenElementsOfRow(null).toString());
    }

}
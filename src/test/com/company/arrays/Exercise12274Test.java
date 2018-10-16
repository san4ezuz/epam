package test.com.company.arrays;

import com.company.arrays.Exercise12274;
import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise12274Test {
    private Exercise12274 test = new Exercise12274();
    private char[][] array = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};

    @Test
    public void testGetWordsFromOddElementsOfColumn() {
        assertEquals("456", test.getWordsFromOddElementsOfColumn(array).toString());
    }

    @Test (expected = IllegalArgumentException.class)
    public void testGetWordsFromOddElementsOfNull(){
        assertEquals(null,test.getWordsFromOddElementsOfColumn(null).toString());
    }

}
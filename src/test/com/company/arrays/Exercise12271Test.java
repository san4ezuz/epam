package test.com.company.arrays;

import com.company.arrays.Exercise12271;
import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise12271Test {
    private Exercise12271 test = new Exercise12271();
    private char[][] array = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};

    @Test
    public void testGetWordFromLine()  {
        assertEquals("456", test.getWordFromLine(array,2,0,2).toString());
    }

    @Test (expected = IllegalArgumentException.class)
    public void testGetWordFromIncorrectLine(){
        assertEquals(null, test.getWordFromLine(array,4,0,1).toString());
    }

    @Test (expected = IllegalArgumentException.class)
    public void testGetWordFromLineWithIncorrectIndexeses(){
        assertEquals(null, test.getWordFromLine(array,2,3,1).toString());
    }

    @Test (expected = IllegalArgumentException.class)
    public void testGetWordFromLineWithWrongInput(){
        assertEquals(null, test.getWordFromLine(array,2,-2,-4).toString());
    }

}
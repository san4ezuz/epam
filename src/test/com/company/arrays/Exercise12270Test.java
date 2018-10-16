package test.com.company.arrays;

import com.company.arrays.Exercise12270;
import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise12270Test {
    private Exercise12270 test = new Exercise12270();
    private char[][] array = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};

    @Test
    public void testGetCorner() {
        assertEquals("1379", test.getCorner(array).toString());
    }

    @Test (expected = IllegalArgumentException.class)
    public void testGetCornerOfNull(){
        assertEquals(null, test.getCorner(null).toString());
    }

    @Test (expected = IllegalArgumentException.class)
    public void testGetCornerOfSmallArray(){
        assertEquals(null, test.getCorner(new char [][]{{1,2,3}}).toString());
    }

}
package test.com.company.recursion;

import com.company.recursion.Exercise1043;
import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise1043Test {

    @Test
    public void testGetSumOfDigits() throws Exception {
        assertEquals(20, new Exercise1043().getSumOfDigits(9128));
    }

    @Test
    public void testGetSumOfDigitsOfZero() throws Exception {
        assertEquals(0, new Exercise1043().getSumOfDigits(0));
    }


    @Test
    public void testGetCountOfDigits() throws Exception {
        assertEquals(4, new Exercise1043().getCountOfDigits(1234));
    }

}
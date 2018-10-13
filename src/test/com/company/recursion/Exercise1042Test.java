package test.com.company.recursion;

import com.company.recursion.Exercise1042;
import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise1042Test {

    @Test
    public void testGetPower() throws Exception {
        assertEquals(1024,new Exercise1042().getPower(2,10));
    }

    @Test
    public void testGetPowerZero() throws Exception {
        assertEquals(1,new Exercise1042().getPower(2,0));
    }

    @Test
    public void testGetPowerOne() throws Exception {
        assertEquals(2,new Exercise1042().getPower(2,1));
    }

}
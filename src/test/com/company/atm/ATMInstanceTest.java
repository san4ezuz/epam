package test.com.company.atm;

import static org.junit.Assert.*;

import com.company.atm.ATMInstance;
import org.junit.Before;
import org.junit.Test;


public class ATMInstanceTest {
    private ATMInstance atm;

    @Before
    public void setUp() {
        atm = new ATMInstance();
        atm.putMoney(1000);
    }

    @Test
    public void testATMGetMoneyOK() {
        assertFalse(atm.getMoney(10000));
        assertTrue(atm.getMoney(100));
    }

}

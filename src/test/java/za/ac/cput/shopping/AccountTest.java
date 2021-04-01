package za.ac.cput.shopping;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    private Account account1;
    private Account account2;
    private Account account3;

    @BeforeEach
    void setUp() {
        account1 = new Account();
        account2 = new Account();
        account3 = account1;
    }

    @Test
    void testIdentity() {
        assertNotSame(account1, account2);
        assertSame(account1, account3);
    }

    @Test
    void testEquality() {
        assertNotEquals(account1, account2);
        assertEquals(account1, account3);
    }

    @Test
    void testGetPayment() {
        System.out.println("Payment Amount");
        Account instance = account1;
        double expResult = 0;
        double result = instance.getPayment();
        assertEquals(expResult, result);
        fail("Designed for FAILURE");
    }

    @Test
    @Timeout(value = 40, unit = TimeUnit.MILLISECONDS)
    void testSetStoreName() {
        System.out.println("Store Name");
        Account instance = account1;
        String result = "";
        instance.setStorename(result);
    }
    @Disabled
    @Test
    void testSetPayment() {
        System.out.println("Entered Amount for Payment");
        Account instance = account2;
        double payment = 0;
        instance.setPayment(payment);
    }


}
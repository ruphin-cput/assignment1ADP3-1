package za.ac.cput;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static java.time.Duration.ofMinutes;
import static java.time.Duration.ofMillis;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTimeout;


class GymAccountTest {
    private GymAccount customer1;
    private GymAccount customer2;
    private GymAccount customer3;

    @BeforeEach
    void setUp()
    {
        customer1= new GymAccount(7890,"John","Doe","Yearly");
        customer2=new GymAccount(3456,"Jane","Isawoman","Monthly");
        customer3=customer1;
    }


    /**This section test identity
     *
     *
     */


    @Test
    void testObjectIdentity()
    {
        assertSame(customer1,customer3);
    }
    @Test
    void testNameIdentity()
    {
        String expResult="Jane";
        String result =customer2.getName();
        assertSame(expResult,result);

    }@Test
    void testContractTypeIdentity()
    {
        String expResult="Yearly";
        String result= customer3.getContractType();
        assertSame(expResult,result);

    }
    /**
     * This section test Equality
     *
     *
     */


    @Test
    void testObjectEquality()
    {
        assertEquals(customer1,customer3);
    }

    @Test

    void testSurnameEquality() {
        String expResult = "Isawoman";
        String result = customer2.getSurname();
        assertEquals(expResult, result);
    }

    @Test
    void testIdEquality()
    {
        int expResult=7890;
        int result= customer3.getId();
        assertEquals(expResult,result);

    }
    /**
     * This section contains test that is meant to fail
     *
     *
     */
    @Test
    void testIdEqualityFails()
    {
        fail("The test was meant to fail on purpose");
        int expResult=7890;
        int result= customer3.getId();
        assertEquals(expResult,result);

    }
    @Test

    void testIdentityFails()
    {
        int expResult=7890;
        int result= customer3.getId();
        assertSame(expResult,result);

    }
    /**
     * This section contains the timeout test


     */

    @Test

    void testCustomerId()
    {

          assertTimeout(ofMillis(10), () ->
        {
            GymAccount customer4=new GymAccount(7897,"lara","Jean","Monthly");
            customer4.setName("Isabelle");
            String result="The customer name was changed to:"+customer4.name;
            System.out.println(result);
            return result;
        });
        System.out.println("Test passed");
    }
    /**
     * This section contains the DISABLED test


     */


    @Disabled("Disable until allowed to run")
    @Test
    void testToBeDisabled()
    {

        assertSame(customer1,customer3);

    }

}
/*
 * Melisa Bhixa,217131085
 * ADP 3 Assignment 1
 * Due Date: 01 April 2021
 */

package ac.za.cput.timeouts;

import org.junit.Test;

import static org.junit.Assert.*;

public class TimeOutsTest {
    TimeOuts tm = new TimeOuts(50);

    @Test(timeout = 3)
    public void testLoop() throws Exception{
        assertEquals(tm.loop(), 50);
    }
}
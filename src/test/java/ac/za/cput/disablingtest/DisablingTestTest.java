/*
 * Melisa Bhixa,217131085
 * ADP 3 Assignment 1
 * Due Date: 01 April 2021
 */

package ac.za.cput.disablingtest;

import junit.framework.TestCase;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class DisablingTestTest extends TestCase {

    DisablingTest id = new DisablingTest(13,20);

    @Ignore
    @Test
    public void testGetX() {
        assertEquals(id.prod(), 260);
    }
}
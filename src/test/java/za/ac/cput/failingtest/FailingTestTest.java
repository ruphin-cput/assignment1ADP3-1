/*
 * Melisa Bhixa,217131085
 * ADP 3 Assignment 1
 * Due Date: 01 April 2021
 */

package za.ac.cput.failingtest;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class FailingTestTest extends TestCase {

    FailingTest id = new FailingTest(25,17);

    @Test
    public void testGetY(){
        assertSame(id.getY(), 12);
    }
}
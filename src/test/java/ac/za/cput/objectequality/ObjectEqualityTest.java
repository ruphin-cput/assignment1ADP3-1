/*
 * Melisa Bhixa,217131085
 * ADP 3 Assignment 1
 * Due Date: 01 April 2021
 */

package ac.za.cput.objectequality;

import junit.framework.TestCase;
import org.junit.Test;
/**
 * Author Melisa Bhixa 217164692
 * Date:
 *
 */
import static org.junit.Assert.*;

public class ObjectEqualityTest extends TestCase {
     private ObjectEquality ob1 = new ObjectEquality(7,3);

    @Test
    public void testObjectEquality() {
        assertEquals(ob1, ob1);
    }
}
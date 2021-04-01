/*
 * Melisa Bhixa,217131085
 * ADP 3 Assignment 1
 * Due Date: 01 April 2021
 */

package za.ac.cput.objectidentity;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class ObjectIdentityTest extends TestCase {

    ObjectIdentity id = new ObjectIdentity(13,99);

    @Test
    public void testGetX() {
        assertNotNull(id.hashCode());
    }
}
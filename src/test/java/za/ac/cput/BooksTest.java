package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

class BooksTest
{
    private Books book1;
    private Books book2;
    private Books book3;

    @BeforeEach
    void setUp()
    {
        book1 = new Books();
        book2 = new Books();
        book3 = book1;
    }

    @Test
    void testIdentity()
    {
        assertSame(book1, book3); //"assertSame" Expecting a true value, but assertNotSame is expected to fail.
    }

    @Test
    void testEquality()
    {
        //fail("The test case is a prototype");
        assertEquals(book1, book3);
    }

    @Test
    void testFail()
    {
        fail("Failed");
    }

    @Test
    @Timeout(4)
    void testTimeout()
    {
        System.out.println("HI");
    }

    @Test
    @Disabled
    void testDisabling()
    {
        fail("Shouldn't fail");
    }
}
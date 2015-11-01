package com.enterprise.java.week2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * This class provides simple examples junit assertion syntax
 * @author paulawaite
 * @version 1.0 9/9/15.
 */
public class DemoBasicAssertions {

    @Test
    public void testForTrue() {
        assertTrue(true);
    }

    @Test
    public void testForTrueWithMessage() {
        assertTrue("This is the true test description", true);
    }

    @Test
    public void testForFalse() {
        assertFalse("This is the false test description", false);
    }

    @Test
    public void testForNull() {
        assertNull("This is the null test description", null);
    }

    @Test
    public void testForNotNull() {
        assertNotNull("This is the test's description", "some String object");
    }

    @Test
    public void testForEquality() {
        assertEquals("This is the test's description", "myString", "myString");
    }


}
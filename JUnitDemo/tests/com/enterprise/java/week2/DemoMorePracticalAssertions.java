package com.enterprise.java.week2;

import org.junit.Ignore;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.*;

/**
 * This class provides slightly more practical examples of junit assertion syntax
 * @author paulawaite
 * @version 1.0 9/9/15.
 */
public class DemoMorePracticalAssertions {

    @Test
    public void testForTrue() {
        int modelYear = 1955;
        int currentYear = 2015;
        assertEquals(60, currentYear - modelYear);
    }

    /** Demonstrate a test where the test should throw an exception.
     *  If the test throws the proper exception, the test passes.
     *  However, if the exception is not thrown, the test will not fail
     *  unless we explicitly fail the test using fail().
     */
    @Test(expected = NumberFormatException.class)
    public void testForNumberFormatException() {
        Integer.parseInt("myString");
        fail("Expected a NumberFormatException");

    }

    /** Demonstrate ignoring tests. This might be useful
     *  if you have test cases for part of a program that
     *  isn't fully implemented yet
     */

    @Ignore
    @Test
    public void testIgnoreAnnotation() {
        fail("This test should be ignored");

    }


}
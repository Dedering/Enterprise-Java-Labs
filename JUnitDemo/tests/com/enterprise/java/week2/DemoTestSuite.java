package com.enterprise.java.week2;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * This class provides an example of using a test suite to run several test classes
 * at the same time. Notice that the configuration of what tests to run
 * is handled entirely in the annotations.
 * @author paulawaite
 * @version 1.0 9/9/15.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    DemoBasicAssertions.class,
        DemoMorePracticalAssertions.class,
        DemoTestFixtures.class

})
public class DemoTestSuite {}
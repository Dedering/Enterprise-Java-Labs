package com.enterprise.java.week2;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * This class provides an example of a basic test fixture
 * @author paulawaite
 * @version 1.0 9/9/15.
 */
public class DemoTestFixtures {

    private double accountBalance;
    private double debitAmount;
    private double creditAmount;

    /** Demonstrate use of @Before to set up the environment for EACH test case
     */
    @Before
    public void setup() {
        accountBalance = 100.00;
        debitAmount = 10.00;
        creditAmount = 50.00;
    }

    @Test
    public void testCreditAccountBalance() {
        String testMessage = "accountBalance + creditAmount = " + (accountBalance + creditAmount);
        accountBalance = accountBalance + creditAmount;
        assertTrue(testMessage, accountBalance == 150.00);
    }

    @Test
    public void testDebitAccountBalance() {
        String testMessage = "accountBalance - debitAmount = " + (accountBalance - debitAmount);
        accountBalance = accountBalance - debitAmount;
        assertTrue(testMessage, accountBalance == 90.00);
    }


}
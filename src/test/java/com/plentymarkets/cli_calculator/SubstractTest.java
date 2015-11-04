package com.plentymarkets.cli_calculator;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class SubstractTest extends TestCase
{
    private String testName;

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public SubstractTest(String testName)
    {
        super( testName );
        this.testName = testName;
    }

    /**
     * Rigourous Test :-)
     */
    public void testDoSubstract()
    {
        double zahl1 = 1;
        double zahl2 = 1;


        Substract substract = new Substract(zahl1, zahl2);
        substract.doSubstract();
        double result = substract.getResult();

        assertTrue(result == 2);
    }
}

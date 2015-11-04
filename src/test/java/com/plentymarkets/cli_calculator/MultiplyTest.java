package com.plentymarkets.cli_calculator;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class MultiplyTest extends TestCase
{
    private String testName;

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public MultiplyTest(String testName)
    {
        super( testName );
        this.testName = testName;
    }

    /**
     * Rigourous Test :-)
     */
    public void testDomultiply()
    {
        double zahl1 = 1;
        double zahl2 = 1;


        Multiply multiply = new Multiply(zahl1, zahl2);
        multiply.doMultiply();
        double result = multiply.getResult();

        assertTrue(result == 2);
    }
}

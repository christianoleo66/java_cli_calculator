package com.plentymarkets.cli_calculator;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class DevideTest extends TestCase
{
    private String testName;

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public DevideTest(String testName)
    {
        super( testName );
        this.testName = testName;
    }

    /**
     * Rigourous Test :-)
     */
    public void testDodevide()
    {
        int zahl1 = 1;
        int zahl2 = 0;

         if(zahl2 == 0 || zahl1 == 0)
         {
             System.out.println("nicht durch 0 teilen");
         }
        else
         {
             Devide devide = new Devide(zahl1, zahl2);
             devide.doDevide();
             double result = devide.getResult();

             assertTrue(result == 2);
         }
    }
}
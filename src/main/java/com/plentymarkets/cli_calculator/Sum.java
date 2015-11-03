package com.plentymarkets.cli_calculator;

/**
 * Created by praktikant on 02.11.15.
 */
public class Sum
{
    private final int zahl1;
    private final int zahl2;
    private int result;

    public Sum(int zahl1, int zahl2)
    {
        this.zahl1 = zahl1;
        this.zahl2 = zahl2;
    }

    public void doSum()
    {
        this.result = this.zahl1 + this.zahl2;
    }

    public int getResult()
    {
        return this.result;
    }
}

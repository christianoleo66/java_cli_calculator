package com.plentymarkets.cli_calculator;

import java.util.InputMismatchException;

/**
 * Hello world!
 */
public class App
{
    public static void main( String[] args )
    {
        try
        {
            // Das Ergebnis

            double result = 0;

            // Fragen, welche Rechenart
            System.out.println("Hallo! Ich bin dein Taschenrechener was wilst du rechnen ? '+'(plus),'-'(minus),'*'(mal) oder '/'(geteilt)?");
            String name = new java.util.Scanner( System.in ).nextLine();

            // Fragen welche erste Zahl
            System.out.println( "ok, Was ist die erste Zahl?" );
            double zahl1 = new java.util.Scanner( System.in ).nextDouble();

            // Fragen welche zweite Zahl
            System.out.println( "ok, Was ist die zweite Zahl?" );
            double zahl2 = new java.util.Scanner( System.in ).nextDouble();

            if(name.equals("+"))
            {
                // Summieren
                result = sum(zahl1, zahl2);
            }
            else if(name.equals("-"))
            {
                // Subtrahieren
                result = substract(zahl1, zahl2);
            }
            else if(name.equals("*"))
            {
                //Multiplikation
                result = multiply(zahl1, zahl2);
            }
            else if(name.equals("/"))
           {
                //Dividieren
                result = devide(zahl1, zahl2);
            }
            else //falsches zeichen

            {
                throw new Exception("Ich kenne diese Rechenart nicht ( ͠° ͟ʖ ͡°)!");
            }

            // Ergebnis zeigen
            System.out.println( "Das Ergebnis ist ᕦ( ͡° ͜ʖ ͡°)ᕤ: " + result );
        }
        catch(Exception e)
        {
            if(e instanceof InputMismatchException)
            {
                // keine zahl,todo kommazahl
                showError("Da hast du wohl was falsche eingegeben ( ͡° ͜ʖ ͡ °)... ");
            }
            else
            {
                showError(e.getMessage());
            }
        }

    }

    private static double devide(double zahl1, double zahl2) throws Exception

            //Dividier code
    {
        if(zahl2 == 0 || zahl1 == 0)
        {
            throw new Exception("Chalange nicht durch 0 teilen ( ͡° ͜ʖ ͡°)");
        }
        else
        {
            Devide devide = new Devide(zahl1, zahl2);
            devide.doDevide();
            double result = devide.getResult();

            return result;
        }
    }

    private static double multiply(double zahl1, double zahl2)

            //Multiplikations code
    {
        Multiply multiply = new Multiply(zahl1, zahl2);
        multiply.doMultiply();
        double result = multiply.getResult();

        return result;
    }
    private static double substract(double zahl1, double zahl2)

            //subtrahier code
    {
        Substract substract = new Substract(zahl1, zahl2);
        substract.doSubstract();
        double result = substract.getResult();

        return result;
    }

    private static double sum(double zahl1, double zahl2)

            //addier code
    {
        Sum sum = new Sum(zahl1, zahl2);
        sum.doSum();
        double result = sum.getResult();

        return result;
    }

    private static void showError(String errorMessage)
    {
        System.out.println( "FEHLER 404: " + errorMessage );
    }

    private static void handleException(Exception e)
    {

    }
}

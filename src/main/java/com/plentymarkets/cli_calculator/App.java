package com.plentymarkets.cli_calculator;

import java.util.InputMismatchException;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        /*System.out.println( "Hello World!" );
        int zahl1 ;
        int zahl2 ;

        zahl1 = 4;
        zahl2 = 2;


        System.out.println(zahl1 + zahl2);

        System.out.println(zahl1 - zahl2);*/

        try
        {
            // Das Ergebnis

            int result = 0;

            // Fragen, welche Rechenart
            System.out.println( "Moin! was willst du rechnen ? '+' oder '-'" );
            String name = new java.util.Scanner( System.in ).nextLine();

            // Fragen welche erste Zahl
            System.out.println( "Was ist die erste Zahl?" );
            int zahl1 = new java.util.Scanner( System.in ).nextInt();

            // Fragen welche zweite Zahl
            System.out.println( "Was ist die zweite Zahl?" );
            int zahl2 = new java.util.Scanner( System.in ).nextInt();

            if(name.equals("+"))
            {
                // Summieren
                result = sum(zahl1, zahl2);
            }
            else if(name.equals("-"))
            {
                // Subtrahieren
                // TODO
            }
            else
            {
                throw new Exception("Ich kenne diese Rechenart nicht!");
            }

            // Ergebnis zeigen
            System.out.println( "Das Ergebnis ist: " + result );
        }
        catch(Exception e)
        {
            if(e instanceof InputMismatchException)
            {
                // TODO das muss eher überprüft werden
                showError("Da hast du wohl was falsche eingegeben…");
            }
            else
            {
                showError(e.getMessage());
            }
        }


        /*System.out.printf( "addieren oder subtrahieren", name );
        int age = new java.util.Scanner( System.in ).nextInt();
        System.out.printf( "Aha, %s Jahre, das ist ja die Hälfte von %s.%n",
                age, age * 2 );
        System.out.println( "Sag mal, was ist deine Lieblingsfließkommazahl?" );
        double value = new java.util.Scanner( System.in ).nextDouble();
        System.out.printf( "%s? Aha, meine ist %s.%n",
                value, Math.random() * 100000 );*/

    }

    private static int sum(int zahl1, int zahl2)
    {
        Sum sum = new Sum(zahl1, zahl2);
        sum.doSum();
        int result = sum.getResult();

        return result;
    }

    private static void showError(String errorMessage)
    {
        System.out.println( "FEHLER: " + errorMessage );
    }

    private static void handleException(Exception e)
    {

    }
}

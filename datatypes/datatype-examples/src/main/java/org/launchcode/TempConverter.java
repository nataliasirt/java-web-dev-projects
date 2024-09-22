package org.launchcode;

import java.util.Scanner;

public class TempConverter {
    //This is the main method in Java, which serves as the entry point of the program. When the program is run, execution starts from here.
    public static void main(String[] args) {
        double fahrenheit;
        double celsius;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        fahrenheit = input.nextDouble();
        input.close();

        celsius = (fahrenheit - 32) * 5/9;
        System.out.println("The temperature in Celsius is: " + celsius + "°C");
    }
}

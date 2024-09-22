package org.launchcode;

import java.util.Scanner;

public class TempConverter {
    //This is the main method in Java, which serves as the entry point of the program. When the program is run, execution starts from here.
    public static void main(String[] args) {
        //These lines declare two variables of type double. double is a data type used to store decimal numbers.
        double fahrenheit;
        double celsius;
        //Declares a Scanner object named input. The Scanner class is used to capture input from the user.
        Scanner input;
//This initializes the input object to take input from the console
        input = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        //This line waits for the user to input a double (decimal number) and assigns it to the fahrenheit variable.
        fahrenheit = input.nextDouble();
        //This closes the Scanner to free up system resources. After calling close(), the input object can no longer be used.
        input.close();

        celsius = (fahrenheit - 32) * 5/9;
        System.out.println("The temperature in Celsius is: " + celsius + "°C");
    }
}

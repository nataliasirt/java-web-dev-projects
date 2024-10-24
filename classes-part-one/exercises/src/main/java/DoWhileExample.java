import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        // A do-while loop that asks the user for a positive number
        do {
            System.out.println("Please enter a positive number:");
            number = scanner.nextInt();
        } while (number <= 0);

        System.out.println("You entered: " + number);
        scanner.close();
    }
}
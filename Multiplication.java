import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Multiply the two numbers
        double result = num1 * num2;

        // Output the result
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + result);
        
        // Close the scanner
        scanner.close();
    }
}


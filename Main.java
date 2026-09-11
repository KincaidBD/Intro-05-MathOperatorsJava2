import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Operations
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;
        double root1 = Math.sqrt(num1);
        double root2 = Math.sqrt(num2);
        double exponent = Math.pow(num1, num2);

        // Display the results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Square root of first number: " + root1);
        System.out.println("Square root of second number: " + root2);
        System.out.println("Exponentiation (first number is base second is exponent): " + exponent);
    }
}

import java.util.Scanner;

public class InputPractice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;

        System.out.println("\n--- Results ---");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);

        if (secondNumber != 0) {
            double division = (double) firstNumber / secondNumber;
            int remainder = firstNumber % secondNumber;

            System.out.println("Division: " + division);
            System.out.println("Remainder: " + remainder);
        } else {
            System.out.println("Division: Cannot divide by zero");
        }

        scanner.close();
    }
}
public class TernaryOperator {

    public static void main(String[] args) {

        int marks = 75;

        // Basic ternary operator
        String result = marks >= 40 ? "Pass" : "Fail";

        System.out.println("Marks: " + marks);
        System.out.println("Result: " + result);

        // Finding greater number
        int a = 20;
        int b = 35;

        int greater = a > b ? a : b;

        System.out.println("Greater number: " + greater);

        // Even or odd
        int number = 12;

        String type = number % 2 == 0 ? "Even" : "Odd";

        System.out.println("Number: " + number);
        System.out.println("Type: " + type);

        // Positive, negative or zero
        int value = -5;

        String sign = value > 0
                ? "Positive"
                : value < 0
                    ? "Negative"
                    : "Zero";

        System.out.println("Value: " + value);
        System.out.println("Sign: " + sign);
    }
}

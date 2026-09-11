public class OperatorPrecedence {

    public static void main(String[] args) {

        // Multiplication has higher precedence than addition
        int result1 = 10 + 5 * 2;
        System.out.println("10 + 5 * 2 = " + result1);

        // Parentheses have the highest priority
        int result2 = (10 + 5) * 2;
        System.out.println("(10 + 5) * 2 = " + result2);

        // Division and multiplication are evaluated before addition
        int result3 = 20 + 12 / 3 * 2;
        System.out.println("20 + 12 / 3 * 2 = " + result3);

        // Parentheses change the order of evaluation
        int result4 = (20 + 12) / 4;
        System.out.println("(20 + 12) / 4 = " + result4);

        // Same precedence: evaluated from left to right
        int result5 = 20 / 5 * 2;
        System.out.println("20 / 5 * 2 = " + result5);

        // Complex expression
        int result6 = 10 + 20 * 2 - 15 / 3;
        System.out.println("10 + 20 * 2 - 15 / 3 = " + result6);
    }
}

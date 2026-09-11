public class OperatorsBasics {

    public static void main(String[] args) {

        int a = 20;
        int b = 6;

        // Arithmetic operators
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Remainder: " + (a % b));

        // Relational operators
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        // Logical operators
        boolean hasJavaKnowledge = true;
        boolean hasSqlKnowledge = true;

        System.out.println(
                "Knows Java and SQL: "
                        + (hasJavaKnowledge && hasSqlKnowledge)
        );

        System.out.println(
                "Knows Java or SQL: "
                        + (hasJavaKnowledge || hasSqlKnowledge)
        );

        System.out.println(
                "Does not know Java: "
                        + (!hasJavaKnowledge)
        );

        // Assignment operators
        int score = 50;

        score += 10;
        System.out.println("After += : " + score);

        score -= 5;
        System.out.println("After -= : " + score);

        score *= 2;
        System.out.println("After *= : " + score);

        // Increment and decrement
        int count = 1;

        count++;
        System.out.println("After increment: " + count);

        count--;
        System.out.println("After decrement: " + count);
    }
}

public class UnaryOperators {

    public static void main(String[] args) {

        int number = 10;

        // Unary plus and minus
        System.out.println("Positive: " + (+number));
        System.out.println("Negative: " + (-number));

        // Pre-increment
        int a = 10;
        System.out.println("Pre-increment: " + (++a));
        System.out.println("Value of a: " + a);

        // Post-increment
        int b = 10;
        System.out.println("Post-increment: " + (b++));
        System.out.println("Value of b: " + b);

        // Pre-decrement
        int c = 10;
        System.out.println("Pre-decrement: " + (--c));
        System.out.println("Value of c: " + c);

        // Post-decrement
        int d = 10;
        System.out.println("Post-decrement: " + (d--));
        System.out.println("Value of d: " + d);

        // Logical NOT
        boolean isJavaEasy = true;
        System.out.println("Before NOT: " + isJavaEasy);
        System.out.println("After NOT: " + (!isJavaEasy));
    }
}

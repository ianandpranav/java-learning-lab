public class ShortCircuit {

    public static void main(String[] args) {

        // && (AND) short-circuit
        boolean result1 = false && checkCondition();

        System.out.println("Result 1: " + result1);

        // || (OR) short-circuit
        boolean result2 = true || checkCondition();

        System.out.println("Result 2: " + result2);

        // Both conditions are evaluated
        boolean result3 = true && checkCondition();

        System.out.println("Result 3: " + result3);

        boolean result4 = false || checkCondition();

        System.out.println("Result 4: " + result4);
    }

    static boolean checkCondition() {

        System.out.println("checkCondition() was executed");

        return true;
    }
}

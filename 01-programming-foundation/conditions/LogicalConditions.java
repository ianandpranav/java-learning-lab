public class LogicalConditions {

    public static void main(String[] args) {

        int age = 22;
        boolean hasId = true;

        if (age >= 18 && hasId) {
            System.out.println("Access granted");
        }

        if (age < 18 || !hasId) {
            System.out.println("Access denied");
        }
    }
}

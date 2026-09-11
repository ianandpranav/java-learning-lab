import java.util.Scanner;

public class ScannerMethods {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your percentage: ");
        double percentage = scanner.nextDouble();

        scanner.nextLine(); // Consume the leftover newline

        System.out.print("Enter your city: ");
        String city = scanner.nextLine();

        System.out.println("\n--- Details ---");
        System.out.println("Name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Percentage: " + percentage);
        System.out.println("City: " + city);

        scanner.close();
    }
}
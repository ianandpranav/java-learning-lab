public class TypeCastingBasics {

    public static void main(String[] args) {

        // Widening casting: int -> double
        int number = 100;
        double widenedNumber = number;

        System.out.println("Original int: " + number);
        System.out.println("After widening: " + widenedNumber);

        // Widening casting: char -> int
        char letter = 'A';
        int asciiValue = letter;

        System.out.println("Character: " + letter);
        System.out.println("Numeric value: " + asciiValue);

        // Narrowing casting: double -> int
        double price = 99.99;
        int narrowedPrice = (int) price;

        System.out.println("Original double: " + price);
        System.out.println("After narrowing: " + narrowedPrice);

        // Narrowing casting: int -> byte
        int largeNumber = 130;
        byte byteValue = (byte) largeNumber;

        System.out.println("Original int: " + largeNumber);
        System.out.println("After int to byte: " + byteValue);

        // Casting during calculation
        int a = 5;
        int b = 2;

        double normalDivision = a / b;
        double castDivision = (double) a / b;

        System.out.println("Integer division: " + normalDivision);
        System.out.println("After casting: " + castDivision);
    }
}
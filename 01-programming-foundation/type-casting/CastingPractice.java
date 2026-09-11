public class CastingPractice {

    public static void main(String[] args) {

        // Practice 1: Convert integer to double
        int marks = 85;
        double marksAsDouble = marks;

        System.out.println("Marks as int: " + marks);
        System.out.println("Marks as double: " + marksAsDouble);

        // Practice 2: Remove decimal part
        double price = 149.75;
        int priceAsInt = (int) price;

        System.out.println("Original price: " + price);
        System.out.println("Price as int: " + priceAsInt);

        // Practice 3: Get accurate average
        int totalMarks = 275;
        int subjects = 3;

        double average = (double) totalMarks / subjects;

        System.out.println("Average marks: " + average);

        // Practice 4: Character to numeric value
        char grade = 'B';
        int gradeValue = grade;

        System.out.println("Grade: " + grade);
        System.out.println("Numeric value: " + gradeValue);

        // Practice 5: Numeric value to character
        int asciiCode = 67;
        char character = (char) asciiCode;

        System.out.println("Numeric code: " + asciiCode);
        System.out.println("Character: " + character);
    }
}
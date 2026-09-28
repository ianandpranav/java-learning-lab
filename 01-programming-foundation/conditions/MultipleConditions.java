public class MultipleConditions {

    public static void main(String[] args) {

        int marks = 75;
        int attendance = 80;

        if (marks >= 40 && attendance >= 75) {
            System.out.println("Student is eligible");
        } else {
            System.out.println("Student is not eligible");
        }
    }
}

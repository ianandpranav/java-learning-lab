public class ObjectBasics {

    public static void main(String[] args) {

        // Creating first object
        ClassBasics student1 = new ClassBasics();

        student1.name = "Anand";
        student1.age = 23;
        student1.course = "Java";

        // Creating second object
        ClassBasics student2 = new ClassBasics();

        student2.name = "Rahul";
        student2.age = 22;
        student2.course = "SQL";

        // Display first object
        System.out.println("--- Student 1 ---");
        student1.displayDetails();

        System.out.println();

        // Display second object
        System.out.println("--- Student 2 ---");
        student2.displayDetails();
    }
}
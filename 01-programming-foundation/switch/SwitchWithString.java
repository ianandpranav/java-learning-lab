public class SwitchWithString {

    public static void main(String[] args) {

        String day = "Monday";

        switch (day) {

            case "Monday":
                System.out.println("Start of the week");
                break;

            case "Wednesday":
                System.out.println("Mid of the week");
                break;

            case "Friday":
                System.out.println("Weekend is near");
                break;

            case "Sunday":
                System.out.println("Weekend");
                break;

            default:
                System.out.println("Regular day");
        }
    }
}

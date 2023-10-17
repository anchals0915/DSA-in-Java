import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empID = sc.nextInt();
        String department = sc.next();

        ////////////////////////////////////////////////////////////////////////////////////////
        switch (empID) {
            case 1:
                System.out.println("Anchal Singh");
                break;
            case 2:
                System.out.println("Vinita Singh");
                break;
            case 3:
                System.out.println("Empolyee No 3");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department ");
                        break;

                    case "CSE":
                        System.out.println("CSE Department ");
                        break;

                    case "EEE":
                        System.out.println("EEE Department ");

                }
                break;

            default:
                break;
        }

        ////////////////////////////////////////////////////////////////////////////////////////

        // better way to write
        switch (empID) {
            case 1 -> System.out.println("Anchal Singh");
            case 2 -> System.out.println("Vinita Singh");
            case 3 -> {
                System.out.println("Empolyee No 3");
                switch (department) {
                    case "IT" -> System.out.println("IT Department ");

                    case "CSE" -> System.out.println("CSE Department ");

                    case "EEE" -> System.out.println("EEE Department ");

                }
            }
            default -> System.out.println("Enter a valid data.");
        }

        sc.close();

    }
}

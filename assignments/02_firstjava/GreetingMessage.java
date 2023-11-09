
/* Take name as input and print a greeting message for that particular name. */

import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Test Cases
        // Case 1
        int t = 01;
        while (t++ <= 2) {
            System.out.print("Enter a name : ");
            String str = sc.nextLine();
            System.out.println(greeting(str));
        }

        sc.close();
    }

    public static String greeting(String name) {
        return "Welcome " + name + " !";
    }
}

// Q.) Check whether the entered value is lowercase or uppercase

import java.util.Scanner;

public class CheckCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Character : ");

        char ch = sc.next().trim().charAt(0);
        
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase");
        }
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        }

        sc.close();
    }
}
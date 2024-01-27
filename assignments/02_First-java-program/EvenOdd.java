/*
 * Write a program to print whether a number is even or odd, also take input
 * from the user.
 */

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Test Cases
        // Case 1
        System.out.println(isEven(sc.nextInt()));
        System.out.println(isEven2(sc.nextInt()));

        // Case 2
        System.out.println(isEven(sc.nextInt()));
        System.out.println(isEven2(sc.nextInt()));

        // Case 3
        System.out.println(isEven(sc.nextInt()));
        System.out.println(isEven2(sc.nextInt()));

        sc.close();
    }

    // Modulo operator 
    public static String isEven(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }

    // Bitwise Operator 
    public static String isEven2(int num) {
        return (num & 1) == 0 ? "Even" : "Odd";
    }
}
// Q: Find the largest of the 3 numbers

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // if Statement
//        int max = a;
//        if (b > max) {
//            max = b;
//        }
//        if (c > max) {
//            max = c;
//        }

        // if-else statement
//        int max = 0;
//        if (a > b) {
//            max = a;
//        } else {
//            max = b;
//        }
//
//        if (c > max) {
//            max = c;
//        }

        int max = Math.max(c, Math.max(a, b));

        System.out.println("Largest of the 3 numbers : " + max);
    }
}
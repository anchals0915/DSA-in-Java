/* Take 2 numbers as input and print the largest number. */

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(largest(num1, num2));
        sc.close();
    }

    public static int largest(int num1, int num2) {
        return num1 > num2 ? num1 : num2;
    }
}

// Q.)Fibonnaci Series

import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n terms to print : ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int count = 2;
        int c;
        System.out.print(a + " " + b + " ");
        while (count++ != n) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

        sc.close();
    }
}

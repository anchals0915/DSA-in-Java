// Fibonnaci Series

import java.util.Scanner;

class FibonnaciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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

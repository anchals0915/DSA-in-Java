package Introduction;

import java.util.Scanner;

/* Q1 : Fibonacci Numbers */

public class Fibonnaci {
    public static void main(String[] args) {
        int ans = fibo(50);
        System.out.println(ans);
    }

    static int fibo(int n) {
        // base condition
        if (n < 2) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}

// nth Fibonnaci Number 
// Akkra Bazzi Formula 
class NthFibonacci {
    public static void main(String[] args) {

        System.out.println("Enter the nth term to print : ");
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() ;
        System.out.println( n+"th term --> "+fiboFormula(n) );
    }
    public static long fiboFormula(int n) {
        return (long) (1 / Math.sqrt(5) * (Math.pow((1 + Math.sqrt(5)) / 2, n) - Math.pow((1 - Math.sqrt(5)) / 2, n)));
    }
}

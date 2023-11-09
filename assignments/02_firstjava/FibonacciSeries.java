
/* To calculate Fibonacci Series up to n numbers. */

public class FibonacciSeries {
    public static void main(String[] args) {
        fibonacci1(10);
        System.out.println(nthfibo(9));
        System.out.println( nthfibo_AkraBazzi(9));
        fiboSeries(10);
    }

    /* Uaing loops */
    public static void fibonacci1(int n) {
        if (n<=2) {
            System.out.println("No elements in Series ");
        }
        int a = 0 ;
        int b = 1 ;
        int c = 0 ;
        System.out.print(a+ ", "+ b+", ");
        for (int i = 2; i <n ; i++) {
            c = a+ b ;
            System.out.print(c+", ");
            a= b ;
            b= c ;
        }
        System.out.println();

    }

    // find the nth Fibonnaci Number : Using Recursion 
    // Fibo(n) = Fibo(n-1) + Fibo(n-2) 
    public static int nthfibo(int n) {
        if(n==0) {
            return 0 ; 
        } else if (n==1) {
            return 1 ; 
        }  
        return nthfibo(n-1) + nthfibo(n-2) ; 
    }

    // find the nth Fibonnaci Number
    // Akra Bazzi
    // 1/root(5) * (  Math.pow( (1+root5)/2 , n) - Math.pow( (1-root5)/2 , n))
    /*
     * Time Complexity : O( (1+root5)/2 )^n
     * O(golden ratio ^ n )
     * O ( 1.6180 ^ n )
     */
    public static int nthfibo_AkraBazzi(int n)  {
        return  (int) Math.floor((1/Math.sqrt(5))*(  Math.pow(1.61803398875, n) - Math.pow(-0.61803398875, n))) ; 
    }

    // Ḍynamic Programming
    // n is the number of terms in the series 
    public static void fiboSeries(int n) {
        int[] fibo = new int[n] ;
        fibo[0] = 0 ; 
        fibo[1] = 1 ; 
        for (int i = 2; i<n; i++) {
            fibo[i] = fibo[i-1] + fibo[i-2] ; 
        }
        for (int i : fibo) {
            System.out.print(i+ ", ");
        }
    } 

}

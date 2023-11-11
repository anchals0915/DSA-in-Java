import java.util.Scanner;

/**
 * Q.) Total Surface Area of Cube
 **/
public class TSA_Cube {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in) ; 
        float side = sc.nextInt() ; 
        System.out.println("Total Surface Area of Cube:" + tsa(side) );
        sc.close();
    }

    static float tsa( float side ) {
         // 20. Total Surface Area of Cube:
        // - Formula: A = 6 * side^2
        float area = 6 * side * side ; 
        return area ; 
    }
}

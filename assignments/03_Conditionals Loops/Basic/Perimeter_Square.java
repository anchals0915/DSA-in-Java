import java.util.Scanner;

/**
 * Q.) Perimeter of Square
 **/
public class Perimeter_Square {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("Enter the side : ");
        float side = sc.nextFloat() ; 
        System.out.println("Perimeter of Square :  "+perimeter(side));
        sc.close();
    }

   
    static float perimeter( float side ) {
        // 12. Perimeter of Square:
        // - Formula: P = 4 * side
        float area = 4 * side; 
        return area ; 
    }
}

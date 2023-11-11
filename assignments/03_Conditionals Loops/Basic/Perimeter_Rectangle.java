import java.util.Scanner;

/**
 * Q.) Perimeter if Rectangle
 **/

public class Perimeter_Rectangle 
{
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length : ");
        float length = sc.nextFloat();

        System.out.print("Enter the width : ");
        float width = sc.nextFloat();

        System.out.println("Perimeter of Rectangle :  " + perimeter(length, width));
        sc.close();

    }

    
    static float perimeter( float length , float width ) {
         // 11. Perimeter of Rectangle:
        // - Formula: P = 2 * (length + width)
        float area = 2 * (length + width) ; 
        return area ; 
    }
}

import java.util.Scanner;

/**
 * Q.) Perimeter Of Equilateral Triangle
 **/
public class Perimeter_Equilateral {
    public static void main(String[] args) { 

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Side : ");
        float side = sc.nextFloat();

        System.out.println("Perimeter of Equilateral Triangle :  " + perimeter(side));
        sc.close();

    }


    static float perimeter( float side ) {
       // 9. Perimeter of Equilateral Triangle:
        // - Formula: P = 3 * side
        float area = 3 * side; 
        return area ; 
    }
}
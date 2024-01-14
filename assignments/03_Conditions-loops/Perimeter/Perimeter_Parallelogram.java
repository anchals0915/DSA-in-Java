import java.util.Scanner;

/**
 * Q.) Perimeter of Parallelogram 
 **/
public class Perimeter_Parallelogram {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base : ");
        float base = sc.nextFloat();

        System.out.print("Enter the height : ");
        float height = sc.nextFloat();

        System.out.println("Perimeter of Parallelogram :  " + perimeter(base, height));
        sc.close();
    }
    static float perimeter( float length , float width ) {
        // 10. Perimeter of Parallelogram:
        // - Formula: P = 2 * (length + width)
        float area = 2 * (length + width) ; 
        return area ; 
    }
}
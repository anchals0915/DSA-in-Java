import java.util.Scanner;

/**
 * Q.) Perimeter of Rectangle 
 **/
public class Perimeter_Rectangle {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length : ");
        float length = sc.nextFloat();
        
        System.out.print("Enter the breadth : ");
        float breadth = sc.nextFloat();

        System.out.println("Perimeter of Parallelogram :  " + perimeter(length, breadth));
        sc.close();
    }
    static float perimeter( float length , float width ) {
        float area = 2 * (length + width) ; 
        return area ; 
    }
}
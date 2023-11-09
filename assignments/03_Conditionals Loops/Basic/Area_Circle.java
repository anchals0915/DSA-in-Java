import java.util.Scanner;

/**
 * Q.) Area Of Circle Java Program
 **/

public class Area_Circle  {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the radius : ");
        float radius = sc.nextFloat() ; 
        System.out.println("Area : "+ area(radius));
        sc.close();
    }

    // Area of a Circle	Area = πr2	r = radius of the circle
    static float area( float radius ) {
        return (float) (Math.PI * Math.pow(radius, 2)) ;
    }
}
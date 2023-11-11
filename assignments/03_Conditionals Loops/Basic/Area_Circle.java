import java.util.Scanner;

/**
 * Q.) Area Of Circle Java Program
 **/

public class Area_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        float radius = sc.nextFloat();
        System.out.println("Area : " + area(radius));
        sc.close();
    }

    // Area of a Circle Area = π*r*r = 
    static float area(float radius) {
        // - Formula: A = π * r^2
        float area = (float) Math.PI * radius * radius;
        return area;
    }
}
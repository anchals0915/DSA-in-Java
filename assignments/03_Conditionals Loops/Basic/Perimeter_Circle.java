import java.util.Scanner;

/**
 * Q.) Perimeter Of Circle
 **/
public class Perimeter_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius : ");
        float radius = sc.nextFloat();

        System.out.println("Perimeter of Circle :  " + perimeter(radius));

        sc.close();
    }

    static float perimeter(float r) {
        // 8. Perimeter of Circle:
        // - Formula: P = 2 * π * r
        float area = (float) (2 * Math.PI * r);
        return area;
    }
}

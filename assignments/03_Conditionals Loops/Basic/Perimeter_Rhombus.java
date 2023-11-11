import java.util.Scanner;

/**
 * Q.) Perimeter of Rhombus
 **/
public class Perimeter_Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Side : ");
        float side = sc.nextFloat();

        System.out.println("Perimeter of Rhombus :  " + perimeter(side));
        sc.close();
    }

    static float perimeter(float side) {
        // 13. Perimeter of Rhombus:
        // - Formula: P = 4 * side
        float area = 4 * side;
        return area;

    }
}

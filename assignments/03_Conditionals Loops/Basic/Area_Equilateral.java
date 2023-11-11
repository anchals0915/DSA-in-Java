import java.util.Scanner;

/**
 * Q.) Area Of Equilateral Triangle
 **/
public class Area_Equilateral {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Side : ");
        float side = sc.nextFloat();

        System.out.println("Area of Equilateral Triangle: " + area(side));
        sc.close();
    }

    static float area(float side) {
        // 7. Area of Equilateral Triangle:
        // - Formula: A = (√3/4) * side^2
        float area = (float) ((Math.sqrt(3) / 4) * side * side);
        return area;

    }
}

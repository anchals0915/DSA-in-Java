import java.util.Scanner;

/**
 * Q.) Area Of Parallelogram
 **/
public class Area_Parallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base : ");
        float base = sc.nextFloat();

        System.out.print("Enter the height : ");
        float height = sc.nextFloat();

        System.out.println("Area of Parallelogram : " + area(base, height));
        sc.close();
    }

    static float area(float base, float height) {
        // 5. Area of Parallelogram:
        // - Formula: A = base * height
        float area = base * height;
        return area;
    }
}
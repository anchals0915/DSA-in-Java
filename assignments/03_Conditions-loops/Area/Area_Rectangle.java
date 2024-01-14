import java.util.Scanner;

/**
 * Q.) Area Of Rectangle Program
 **/
public class Area_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length : ");
        float length = sc.nextFloat();

        System.out.print("Enter the width : ");
        float width = sc.nextFloat();

        System.out.println("Area of Rectangle : " + area(length, width));
        sc.close();

    }

    static float area(float length, float width) {
        // 3. Area of Rectangle:
        // - Formula: A = length * width
        float area = length * width;
        return area;
    }
}
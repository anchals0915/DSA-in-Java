import java.util.Scanner;

/**
 * Q.) Volume of Pyramid 
 **/
public class Volume_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the baseArea and height : ");
        float baseArea = sc.nextFloat();
        float height = sc.nextFloat();

        System.out.println("Volume of Cone:" + volume(baseArea, height));
        sc.close();
    }

    static float volume(float baseArea, float height) {
        // 18. Volume of Pyramid:
        // - Formula: V = (1/3) * base area * height
        float area = (1 / 3) * baseArea * height;
        return area;

    }
}

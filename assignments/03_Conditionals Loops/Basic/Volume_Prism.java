import java.util.Scanner;

/**
 * Q.)Volume of Prism:
 **/
public class Volume_Prism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the baseArea and height : ");
        float baseArea = sc.nextFloat();
        float height = sc.nextFloat();

        System.out.println("Volume of Prism:" + volume(baseArea, height));
        sc.close();
    }

    static float volume(float baseArea, float height) {
        // 15. Volume of Prism:
        // - Formula: V = base area * height
        float area = baseArea * height;
        return area;
    }
}

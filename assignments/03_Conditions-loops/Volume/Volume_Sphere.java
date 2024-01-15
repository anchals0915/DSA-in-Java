import java.util.Scanner;

/**
 * Q.) Volume of Sphere
 **/
public class Volume_Sphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        float radius = sc.nextFloat();

        System.out.println("Volume of Cone:" + volume(radius));
        sc.close();
    }

    static float volume(float r) {
        // 17. Volume of Sphere:
        // - Formula: V = (4/3) * π * r^3
        float area = (float) ((4 / 3) * Math.PI * r * r * r);
        return area;

    }
}
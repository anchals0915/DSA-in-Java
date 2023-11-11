import java.util.Scanner;

/**
 * Q.) Volume of Cube 
 **/
public class Volume_Cone {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the radius and height : ");
        float r = sc.nextFloat() ;
        float h = sc.nextFloat() ;

        System.out.println("Volume of Cone:" + volume(r, h));
        sc.close();
    }
    static float volume( float r , float h ) {
         // 14. Volume of Cone:
        // - Formula: V = (1/3) * π * r^2 * h
        float area = (float) ((1/3) * Math.PI * r * r * h); 
        return area ; 
    }
}

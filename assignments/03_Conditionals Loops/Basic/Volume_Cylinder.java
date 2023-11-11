import java.util.Scanner;

/**
 * Q.)  Volume of Cylinder:
 **/
public class Volume_Cylinder {
    public static void main(String[] args) { 
         Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the radius and height : ");
        float r = sc.nextFloat() ;
        float h = sc.nextFloat() ;

        System.out.println("Volume of Cylinder:" + volume(r, h));
        sc.close();
    }

    static float volume( float r , float h  ) {
        // 16. Volume of Cylinder:
        // - Formula: V = π * r^2 * h
        float area = (float) (Math.PI * r*r * h) ; 
        return area ; 
    }
}

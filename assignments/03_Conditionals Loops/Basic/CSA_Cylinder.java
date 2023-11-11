import java.util.Scanner;

/**
 * Q.) Curved Surface Area of Cylinder
 **/
public class CSA_Cylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        
        System.out.println("Enter radius and height : ");
        float radius = sc.nextFloat();
        float height = sc.nextFloat() ; 
        
        System.out.println("Curved Surface Area of Cylinder : "+ csa(radius, height));

        sc.close();
    }

    /*
     * Time Complexity : O( )
     */
    static float csa(float r ,float h) {        
        // 19. Curved Surface Area of Cylinder:
        // - Formula: A = 2 * π * r * h
        float area = (float) (2 * Math.PI * r * h); 
        return area ; 

    }
}

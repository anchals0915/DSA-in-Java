import java.util.Scanner;

/**
 * Q.) Area Of Rhombus
 **/
public class Area_Rhombus {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the d1 : ");
        float d1 = sc.nextFloat();

        System.out.print("Enter the d2 : ");
        float d2 = sc.nextFloat();

        System.out.println("Area of Rhombus : " + area(d1, d2));
        sc.close();
    }

    
    static float area( float d1 , float d2 ) {
        // 6. Area of Rhombus:
        // - Formula: A = (d1 * d2) / 2
        float area = (d1 * d2) / 2; 
        return area ; 

    }
}

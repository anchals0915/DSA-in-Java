import java.util.Scanner;

/**
 * Q.) Area Of Triangle
 **/
public class Area_Triangle 
{
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in) ;
        
        System.out.print("Enter the base : ");
        float base = sc.nextFloat() ; 

        System.out.print("Enter the height : ") ; 
        float height = sc.nextFloat() ; 
        
        System.out.println("Area of Triangle : "+ area(base ,height));
        
        sc.close();
    }

    static float area( float base , float height ) {
        // 2. Area of Triangle:
        // - Formula: A = (1/2) * base * height
        float area = 0.5f * base * height; 
        return area ; 

    }
}

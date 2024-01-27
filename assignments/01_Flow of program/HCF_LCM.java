import java.util.Scanner;

public class HCF_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int n1 = sc.nextInt();

        System.out.print("Enter 2nd number : ");
        int n2 = sc.nextInt();

        int hcf = gcd(n1, n2);
        int lcm = lcm(n1, n2) ; 
        System.out.println("HCF : " + hcf);
        System.out.println("LCM : " + lcm);
    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    
    static int lcm(int n1 , int n2 ) {
        return (n1*n2) / gcd(n1, n2) ;  
    }

}

import java.util.Scanner;

class Questions
{
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n= sc.nextInt();
        // System.out.println( isPrime(n));
        

        // Temperature Celsius to Fahrenhit
        // float fah = Cel_to_Fah();
        // System.out.println( "Temperature in Fah : "+ fah );

        // Armstring Number
        threeDig_Armstrong();
    }

    // Check Armstrong 
    static boolean CheckArmstrong(int n)
    {
        int i=n;
        int add=0;
        while(i>0)
        {
            int lastdigit=i%10;
            add+=  lastdigit*lastdigit*lastdigit;
            i/=10;
        }
        return add==n ;
    }

    // Print all the three digit armstring numbers
    static void  threeDig_Armstrong()
    {
        for (int n = 100; n <1000; n++) {
            if(CheckArmstrong(n)){
                System.out.print(n+" ");
            }
        }        
    }

    
    static boolean isPrime(int n) 
    {
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c<=n)
        {
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }

    static float Cel_to_Fah() 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Temperture in C  :");
        float cel = sc.nextFloat();
        return ((cel * 9/5)+32) ;
    }

}

public class PrettyPrinting {
    public static void main(String[] args) {
        /*
         %c character
         %d decimal (integer) number (base 10)
         %e exponential floating-point number
         %f floating-point number
         %i integer (base 10)
         %o octal number (base 8)
         %s String
         %u unsigned decimal (integer) number
         %x number in hexadecimal (base 16)
         %t formats date/time
         %% print a percent sign
         \% print a percent sign
        */
        float a = 453.45234f ;
        System.out.printf("Formatted number is : %.2f" , a);

        System.out.printf("Pie : %.3f" , Math.PI);
        System.out.printf( "Hello my name is %s and I am %s" , "Anchal" , "Cool!");
    }
}


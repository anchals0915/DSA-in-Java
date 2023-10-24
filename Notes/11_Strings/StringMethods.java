import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Anchal Singh" ;
        System.out.println( Arrays.toString(name.toCharArray()));
        System.out.println( name.toLowerCase() );
        System.out.println(name); 
        System.out.println( name.indexOf('a'));
        System.out.println( name.lastIndexOf("a"));
        System.out.println( "   A  n  c  h  a  l ".strip());
        System.out.println("   A  n  c  h  a  l ".trim());
        System.out.println( Arrays.toString(name.split(" ")));
    }

}

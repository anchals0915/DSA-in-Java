
public class Strings {
    public static void main(String[] args) {
        int primitive = 10 ;
        int[] arr ={1,2,3,4,50 } ;
        String name = "Anchal Singh" ;

        String a = "Anchal" ;
        System.out.println(a);
        a = "Singh" ;
        System.out.println(a);

        String b = "Anchal" ;
        if(a==b) {
            System.out.println("Same");
        }

        String name1 = new String("Anchal") ;
        String name2 = new String("Anchal") ;

        System.out.println( name1 == name2 );

        System.out.println( name1.equals(name2));

        System.out.println(56);
        System.out.println("Anchu");
        System.out.println( new int[]{2,3,4,5});

        Integer num = new Integer(56) ;
        System.out.println( num.toString());
        System.out.println( num );
    }
}

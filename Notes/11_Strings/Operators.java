import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'  ); //a
        System.out.println('b' ); // b
        
        System.out.println('a' + 'b' ); //195
        // 'a' and 'b' are treated as their ASCII values (97 for 'a' and 98 for 'b'). 
        // So, the addition operation is performed on these values (97 + 98), resulting in 195.


        System.out.println("a" + "b"); //  ab
        //  "a" and "b" are concatenated using the + operator


        System.out.println((char)('a' + 3) ); // d
        // first adds 3 to the ASCII value of 'a' (97 + 3), which gives 100. 
        // Then, it converts this integer value ---> back to a character using (char). 
        // In ASCII, the character with value 100 ---> 'd

        System.out.println('a' + 3 ); //  100
        // addition operation is performed on the ASCII value of 'a' (97) and 3,

        System.out.println("a" + 3 ); // a3

        System.out.println("a" + 1);
        // this is same as after a few steps: "a" + "1"
        // integer will be converted to Integer that will call toString()

        System.out.println("Kunal" + new ArrayList<>()); //Kunal[]
        System.out.println("Anchal" + new Integer(56)); //Anchal56

        // To concatenate objects of non-string types, you need to convert them to strings first
        System.out.println(new ArrayList<>()+""+new Integer(56)); 
        // + operator you can only use with primitives and any one of them is String 
        // you're trying to concatenate an empty ArrayList with an Integer. 
        // However, the + operator is not defined for these types. 
        // Java doesn't know how to perform this operation, so it throws an error.

    }
}
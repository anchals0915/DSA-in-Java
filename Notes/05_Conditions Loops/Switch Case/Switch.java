/*Switch Statements */

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();

        switch (fruit) {
            case "Mango":
                System.out.println("King of fruits ");
                break;
            case "Apple":
                System.out.println("a sweet red fruit");
                break;
            case "Orange":
                System.out.println("round fruit");
                break;
            case "Grapes":
                System.out.println("small fruit");
                break;
            default:
                System.out.println("Please enter a valid fruit");
        }

        sc.close();
    }
}

/* Enchanced Switch */
class Enchanced_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();

        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits ");
            case "Apple" -> System.out.println("a sweet red fruit");
            case "Orange" -> System.out.println("round fruit");
            case "Grapes" -> System.out.println("small fruit");
            default -> System.out.println("Please enter a valid fruit");
        }

        sc.close();
    }

}

// Note:
// * cases have to be the same type as expression must be a constant or literal
// * duplicate case values are not allowed
// * break is use to terimate the sequence
// * if break is not used it will continuew to next case

// break is used to terimate the
// == checks the refernces of the String

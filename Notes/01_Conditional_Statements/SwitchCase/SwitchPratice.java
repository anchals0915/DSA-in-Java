package SwitchCase;

import java.util.Scanner;

public class SwitchPratice {
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

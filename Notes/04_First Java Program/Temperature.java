import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temperture in C  :");
        float cel = sc.nextFloat();
        System.out.println("Temperature in Fahrehit :  " + ((cel * 9 / 5) + 32));

        sc.close();
    }
}
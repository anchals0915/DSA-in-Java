import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Principle , Rate , and time : ");
        int P = sc.nextInt();
        float R = sc.nextFloat();
        int time = sc.nextInt();
        System.out.println("Simple Interest : " + simpleInterest(P, time, R));

        sc.close();
    }

    public static float simpleInterest(int P, int time, float R) {
        return (P * R * time) / 100;
    }

}
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int n1 = sc.nextInt();

        System.out.print("Enter 2nd number : ");
        int n2 = sc.nextInt();

        int res = n1 + n2;

        System.out.println("Result : " + res);
        sc.close();
    }
}

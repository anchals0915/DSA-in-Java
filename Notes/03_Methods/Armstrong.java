import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean ans = isArmstrong(n);
        System.out.println(ans);

        printArmstrong();
    }

    // print all the three digit armstrong number
    static void printArmstrong() {
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isArmstrong(int n) {
        int a = n;
        int sum = 0;
        while (a > 0) {
            int rem = a % 10;
            int cube = rem * rem * rem;
            sum = sum + cube;
            a = a / 10;
        }

        return sum == n;
    }

}

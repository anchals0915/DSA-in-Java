import java.util.Scanner;

public class SumOfAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num;
        try {
            while (true) {
                System.out.print("Enter number : ");
                num = sc.nextInt();
                sum += num;
            }
        } catch (Exception e) {
            System.out.println("-------------");
        }
        System.out.println("Result : " + sum);
    }
}

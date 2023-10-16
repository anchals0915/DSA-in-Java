
import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();
        int num1 = sc.nextInt();
        System.out.println(num1);

        // type casting
        int num2 = (int) (67.56f);
        // System.out.println(num2);

        // automatic type promotion in expressions
        int a = 257;
        byte b = (byte) (a); // 257 % 256 = 1

        byte a1 = 40;
        byte b1 = 50;
        byte c1 = 100;

        int d1 = a1 * b1 / c1;
        System.out.println(d1);

        byte b2 = 50;
        // b2 = b2 * 2; data is of int

        int number = 'A';
        System.out.println("你好");

        System.out.println(3 * 6);

        byte b3 = 42;
        char c3 = 'a';
        short s3 = 1024;
        int i3 = 50000;
        float f3 = 5.67f;
        double d3 = 0.1234;
        double result = (f3 * b3) + (i3 / c3) - (d3 * s3);

        // float + int - double = double
        System.out.println((f3 * b3) + " " + (i3 / c3) + " " + (d3 * s3));
        System.out.println(result);

        sc.close();
    }
}
// Calculator

import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char op;
        do {
            System.out.println("1.+\n2.-\n3.*\n4./\n");
            op = sc.next().trim().charAt(0);

            System.out.print("Enter two numbers : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            switch (op) {
                case '+':
                    System.out.println("Result : " + (a + b));
                    break;
                case '-':
                    System.out.println("Result : " + (a - b));
                    break;
                case '*':
                    System.out.println("Result : " + (a * b));
                    break;
                case '/':
                    System.out.println("Result :  " + (a / b));
                    break;
            }

        } while (op != 'X' || op != 'x');

        sc.close();
    }
}

/*
 * Take in two numbers and an operator (+, -, *, /) and calculate the value.
 * (Use if conditions)
 */

 import java.util.Scanner;

 public class Operation {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter two number : ");
         int num1 = sc.nextInt();
         int num2 = sc.nextInt();
         System.out.print("Enter the operator :");
         char op = sc.next().charAt(0);
 
         System.out.println("RESULT : " + operation(num1, num2, op));
         sc.close();
     }
 
     public static int operation(int no1, int no2, char op) {
         int val = 0;
         switch (op) {
             case '+' -> val = no1 + no2;
             case '-' -> val = no1 - no2;
             case '*' -> val = no1 * no2;
             case '/' -> val = no1 / no2;
         }
         return val;
     }
 }
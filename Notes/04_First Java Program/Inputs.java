
import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter some input: ");
        int rollno = sc.nextInt();
        System.out.println("Your roll number is " + rollno);

        String name = sc.next();
        System.out.println(name);

        float marks = sc.nextFloat();
        System.out.println(marks);
    }
}
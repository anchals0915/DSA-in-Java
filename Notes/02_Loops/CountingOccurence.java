import java.util.Scanner;


// Q.)Counting Occurence
public class CountingOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        byte digit = sc.nextByte();
        int count = 0;
        while (num != 0) {
            if ((num % 10) == digit)
                count++;
            num /= 10;
        }
        System.out.println("Count of occurence is :" + count);
        sc.close();
    }
}

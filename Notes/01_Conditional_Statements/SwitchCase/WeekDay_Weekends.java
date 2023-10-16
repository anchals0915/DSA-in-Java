package SwitchCase;

import java.util.Scanner;

public class WeekDay_Weekends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        // Switch Case
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Week Days");
                break;

            case 6:
            case 7:
                System.out.println("Weekends");
        }

        // Enchanced Switch case
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Week Days");
            case 6, 7 -> System.out.println("Weekends");
        }

        sc.close();
    }
}
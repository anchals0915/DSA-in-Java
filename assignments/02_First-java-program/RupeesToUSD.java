/* Input currency in rupees and output in USD. */

import java.util.Scanner;

public class RupeesToUSD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Amount in Rupees INR : ");
        float rupees = sc.nextInt();
        System.out.println("Amount in dollars (USD) : " + convertToUSD(rupees));
        sc.close();
    }

    public static float convertToUSD(float rupees) {
        return rupees / 83.27f;
    }

}
/* To find Armstrong Number between two given number. */

public class ArmstrongInRange {
    public static void main(String[] args) {
        System.out.println("Armstrong Numbers");

        int start = 0;
        int end = 1000;
        System.out.print("In Range : ");
        armstrong(start, end);

    }

    public static void armstrong(int start, int end) {
        for (int i = start + 1; i < end; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + ", ");
            }
        }
    }

    // Armstrong number is the number in any given number base,
    // which forms the total of the same number, when each of its digits is raised
    // to the power of the number of digits in the number
    // For 153, the operation is 1^3 5^3 3^3=153
    static boolean isArmstrong(int num) {
        int i = num;
        int sum = 0;
        int noOfDigits = noOfDigits(num);
        while (i > 0) {
            int lastdigit = i % 10;
            sum += (int) (Math.pow(lastdigit, noOfDigits));
            i /= 10;
        }
        return sum == num;
    }

    static int noOfDigits(int num) {
        return (int) Math.log10(num) + 1;
    }

}
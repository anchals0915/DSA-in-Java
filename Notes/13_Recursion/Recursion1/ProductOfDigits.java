
public class ProductOfDigits {
    public static void main(String[] args) {
        System.out.println(proOfDigits(12378));
    }

    /**
     * Q-06 : Product of digits
     */
    static int proOfDigits(int n) {
        if (n % 10 == n) {
            return n;
        }

        return n % 10 * proOfDigits(n / 10);
    }

}

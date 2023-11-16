
/**
 * Q-09 : Count number of Zeros in a number
 */
// If we take count inside arguement
public class CountZeros {
    public static void main(String[] args) {
        System.out.println(count(102004));
    }

    static int count(int n) {
        return helper(n, 0);
    }

    // special pattern , how to pass a value to above calls
    static int helper(int n, int count) {
        if (n == 0) {
            return count;
        }

        int rem = n % 10;
        if (rem == 0) {
            return helper(n / 10, count + 1);
        }

        return helper(n / 10, count);
    }
}

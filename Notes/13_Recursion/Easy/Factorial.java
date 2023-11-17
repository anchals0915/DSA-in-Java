
class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    static long factorial(int n) {
        // Base Condition
        if (n == 0) {
            return 1;
        }

        return n * factorial(n - 1);
    }

}

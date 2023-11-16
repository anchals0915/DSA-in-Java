
class Recursion {
    public static void main(String[] args) {
        // nto1(5);
        // onetoN(5) ;
        funBoth(5);
    }

    /**
     * Q-01 : n to 1
     */
    static void nto1(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        nto1(n - 1);
    }

    /**
     * Q-02 : 1 to n
     */
    static void onetoN(int n) {
        if (n == 0) {
            return;
        }
        onetoN(n - 1);
        System.out.print(n + " ");
    }

    static void funBoth(int n) {
        nto1(n);
        System.out.println();
        onetoN(n);
    }
}
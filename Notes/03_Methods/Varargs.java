public class Varargs {
    public static void main(String[] args) {
        fun(1, 2, 3, 4, 45, 56, 67, 78, 89, 0);
        fun();
        multiple(2, 3, "Anchal", "Singh");
    }

    static void multiple(int a, int b, String... v) {
        System.out.println(a + "\t" + b + "\t" + java.util.Arrays.toString(v));
    }

    // static void multiple(int a,String...v,int b)
    // {
    // }

    static void fun(int... v) {
        System.out.println(java.util.Arrays.toString(v));
    }
}

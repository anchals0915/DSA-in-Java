public class MethodPratice {
    public static void main(String[] args) {
        greet();
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static String greet() {
        return "Hi! How are you ? ";
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        // this change will only be valid inside the function
    }
}
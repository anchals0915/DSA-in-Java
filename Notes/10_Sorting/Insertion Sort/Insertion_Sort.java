import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 4, 1, 2 };
        System.out.println("Input : " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Output : " + Arrays.toString(arr));
    }

    static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    System.out.println("Break");
                    break;
                }
                System.out.println("\n i : " + i + " j :" + j + Arrays.toString(arr));
            } // inner for loop
        } // outer for loop
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}

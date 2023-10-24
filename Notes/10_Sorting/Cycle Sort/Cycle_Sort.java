import java.util.Arrays;

class Cycle_Sort {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 2, 2 };
        cycleSort(arr);
        System.out.println("Output : " + Arrays.toString(arr));
    }

    static void cycleSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            System.out.println("Current : " + Arrays.toString(arr));
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
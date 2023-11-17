package Introduction;

/* Q2 : Binary Search */

public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 55, 66, 78 };
        int target = 78;
        System.out.println(binarySearch(nums, target, 0, nums.length - 1));
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (target < arr[mid]) {
            return binarySearch(arr, target, start, mid - 1);
        }
        return binarySearch(arr, target, mid + 1, end);
    }
}
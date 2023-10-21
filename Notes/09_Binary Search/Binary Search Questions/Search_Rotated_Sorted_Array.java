

/**
 * 3. Search in Rotated Sorted Array
 * There is an integer array nums sorted in ascending order (with distinct
 * values).
 * 
 * Prior to being passed to your function, nums is possibly rotated at an
 * unknown pivot index k
 * (1 <= k < nums.length) such that the resulting array is
 * [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]
 * (0-indexed).
 * 
 * For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become
 * [4,5,6,7,0,1,2].
 * 
 * Given the array nums after the possible rotation and an integer target,
 * return the index of target if it is in nums, or -1 if it is not in nums.
 * 
 * You must write an algorithm with O(log n) runtime complexity.
 * 
 * Example 1:
 * 
 * Input: nums = [4,5,6,7,0,1,2], target = 0
 * Output: 4
 * Example 2:
 * 
 * Input: nums = [4,5,6,7,0,1,2], target = 3
 * Output: -1
 * Example 3:
 * 
 * Input: nums = [1], target = 0
 * Output: -1
 * 
 * 
 *      General Sorted Array:
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7 } ; 

        Rotated Sorted Array:
        int[] rsa ={4, 5, 6, 7, 0, 1, 2 } ;

        Duplicates:
        int[]  duplicates ={1, 3, 3, 3, 4, 5, 6 } ; 

        Target at Different Positions:
        int [] arr1 = {4, 5, 6, 7, 0, 1, 2 } ;
        int target =  4 ;
        itn target = 7;
        int target = 2 ; 

        Target Not in Array: ------> Test cases where the target element is not present in the array.
        int [] arr2 = {4, 5, 6, 7, 0, 1, 2 } ;
        int target = 8 ;
        
        Empty Array:
        int[] emptyarray ={ } ; 

        Single Element Array:
        int[] singleelement ={3};

        Negative Numbers:
        int[] negative ={-5, -3, 0, 2, 4, 7, 9 };
 */

class Search_Rotated_Sorted_Array {
    // find pivot 
    // Search in first half => Simple Binary Search (0,pivot) 
    // else Search in seacond half (pivot+1 , length)
    public static void main(String[] args) {
        // int [] arr = {4,5,6,7,0,1,2 } ;
        int [] arr =  {1, 3, 3, 3, 4, 5, 6}; ;

        System.out.println( search(arr, 0));
    }

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        // if you did not find a pivot, it means the array is not rotated
        if (pivot == -1) {
            // just do normal binary search
            return binarySearch(nums, target, 0 , nums.length - 1);
        }

        // if pivot is found, you have found 2 asc sorted arrays
        if (nums[pivot] == target) {
            return pivot;
        }

        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }

    // this will not work in duplicate values
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }

            // if elements at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check whether end is pivot
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

}









class Search_Rotated_Sorted_Array_2 
{
    public static void main(String[] args) {

        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7 };
        System.out.println(search(sortedArray, 4)); // Output: 3
        
        int[] rsa = {4, 5, 6, 7, 0, 1, 2 };
        System.out.println(search(rsa, 4)); // Output: 0
        
        //  does not work for duplicates 
        int[] duplicates = {1, 3, 3, 3, 4, 5, 6};
        // System.out.println("With Duplicate Array : (Target : 3)"  + search( duplicates, 3)); // Output: 3
        // correct answer should be 1 (First occurrence of 3)

        System.out.println("With Duplicate Array : (Target : 5)"  + search( duplicates, 5)); // Output: 5 (Index of 5)
        System.out.println("With Duplicate Array : (Target : 2)"  + search( duplicates, 2)); // Output: -1 (Not found)
         

        int[] arr1 = {4, 5, 6, 7, 0, 1, 2 };
        int target1 = 4;
        System.out.println(search(arr1, target1)); // Output: 0
        
        int target2 = 7;
        System.out.println(search(arr1, target2)); // Output: 3
        
        int target3 = 2;
        System.out.println(search(arr1, target3)); // Output: 6
        
        
        int[] arr2 = {4, 5, 6, 7, 0, 1, 2 };
        int target4 = 8;
        System.out.println(search(arr2, target4)); // Output: -1
        
        int[] emptyArray = {};
        System.out.println(search(emptyArray, 5)); // Output: -1
        
        int[] singleElement = {3};
        System.out.println(search(singleElement, 3)); // Output: 0
        
        int[] negative = {-5, -3, 0, 2, 4, 7, 9 };
        System.out.println(search(negative, -3)); // Output: 1
    }

    public static int search(int[] nums, int target) 
    {
        int start = 0;
        int end = nums.length - 1;
        
        while (start <= end) {
            int mid = start + ( end - start ) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            if (nums[start] <= nums[mid]) {
                if (nums[start] <= target && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } 
            else 
            {
                if (nums[mid] < target && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}



class Search_Rotated_Sorted_Array_3 {
    /**
     * Define the pivot index as representing the smallest element in nums.
     * 
     * In a rotated sorted array, the pivot value signifies where the rotation occurs. 
     * It partitions the array (of length nnn) into two sorted portions nums[0 ~ pivot - 1] and nums[pivot ~ n - 1].
     * 
     * Approach =====>  Find Pivot Index + Binary Search
     * To find the pivot value, we can employ a modified binary search algorithm and 
     * find the leftmost element that is smaller than or equal to the last element in nums.
     *
     * After identifying the middle element in the searching space [left ~ right], 
     * we compare nums[mid] with nums[-1].
     *      If nums[mid] > nums[-1], it suggests that the pivot value lies on the right of nums[mid].
     *          We will then proceed with the right half of the search space, which is [mid + 1 ~ right].
     * 
     *      Otherwise, the pivot value is nums[mid] or it's situated to the left of nums[mid], 
     *          we continue with the left half of the searching space, which is [left ~ mid - 1].
     * 
     * 
     * By determining the pivot value, we set the boundaries for our subsequent binary searches. 
     * Once we have the pivot value, 
     *      we can execute two binary searches on each half of the array to locate the target element.
    

 * Do binary search to find the pivot element by initializing the boundaries of the 
 * searching space ---> left = 0 and right = n - 1. 
 * 
 * While left < right:
 *          Let mid <-- left + (right - left) 
 *          If nums[mid] > nums[n - 1], 
 *                  this suggests that pivot is located to the right of mid, 
 *                  hence we set left = mid + 1. 
 *          Otherwise, 
 *                  pivot could be either at mid or to the left of mid, 
 *                  in which case we should set right = mid - 1.
 * 
 * Upon completion of the binary search --------> we have the pivot index denoted as pivot = left.
 * nums consists of two sorted subarrays  
 * -------->  nums[0 ~ left - 1] 
 *  --------> nums[left ~ n - 1].
 * 
 * Do binary search over nums[0 ~ left - 1] for target. 
 *          If target is within this subarray, 
 *                  return its index.
 *          Otherwise, 
 *                  Do binary search over nums[left ~ n - 1] for target. 
 *                  If target is within this subarray, 
 *                          return its index. 
 *                  Otherwise, 
 *                          return -1.
 */
    public static void main(String[] args) {


        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(search(sortedArray, 4)); // Output: 3

        int[] rsa = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(search(rsa, 4)); // Output: 0

        //  does not work for duplicates 
        int[] duplicates = {1, 3, 3, 3, 4, 5, 6};
        // System.out.println("With Duplicate Array : (Target : 3)"  + search( duplicates, 3)); // Output: 3
        // correct answer should be 1 (First occurrence of 3)


        int[] arr1 = {4, 5, 6, 7, 0, 1, 2};
        int target1 = 4;
        System.out.println(search(arr1, target1)); // Output: 0

        int target2 = 7;
        System.out.println(search(arr1, target2)); // Output: 3

        int target3 = 2;
        System.out.println(search(arr1, target3)); // Output: 6


        int[] arr2 = {4, 5, 6, 7, 0, 1, 2};
        int target4 = 8;
        System.out.println(search(arr2, target4)); // Output: -1

        int[] emptyArray = {};
        System.out.println(search(emptyArray, 5)); // Output: -1

        int[] singleElement = {3};
        System.out.println(search(singleElement, 3)); // Output: 0

        int[] negative = {-5, -3, 0, 2, 4, 7, 9};
        System.out.println(search(negative, -3)); // Output: 1

    }


    public static int search(int[] arr, int target) {
        int n = arr.length;
        int start = 0, end = n - 1;
        
        // Find the index of the pivot element (the smallest element)
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] > arr[n - 1]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
    
        // Binary search over elements on the pivot element's left
        int answer = binarySearch(arr, 0, start - 1, target);
        if (answer != -1) {
            return answer;
        }
        
        // Binary search over elements on the pivot element's right
        return binarySearch(arr, start, n - 1, target);
    }
    
    // Binary search over an inclusive range [left_boundary ~ right_boundary]
    static int binarySearch(int[] arr, int leftBoundary, int rightBoundary, int target) {
        int start = leftBoundary, end = rightBoundary;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}

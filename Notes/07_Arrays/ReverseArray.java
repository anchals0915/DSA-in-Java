
// Q.)  swap ith index to jth index

import java.util.Arrays;

public class ReverseArray 
{
    public static void main(String[] args) {
        int[] arr= {1,3,23,5,9,18};
        System.out.println( Arrays.toString(arr));

        // swap(arr,1,3);

        reverse(arr);

        System.out.println( Arrays.toString(arr));
    }
    // reverse the whole array using swap
    static void reverse(int[]arr)
    {
        int start =0;
        int end =arr.length-1;
        while(start<end)
        {
            // swap
            swap(arr, start,end);
            start++;
            end--;
        }
        // this is known as two pointer methods
    }


    // swap 
    static void swap(int[] arr, int index1, int index2) 
    {
        int temp = arr[index1];
        arr[index1] =arr[index2];
        arr[index2] = temp;
    }
}

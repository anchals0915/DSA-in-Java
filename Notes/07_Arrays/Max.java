
// Q.)max item

import java.util.Arrays;

public class Max
{
    public static void main(String[] args) 
    {
        int[] arr= {1,3,23,5,9,18};
        System.out.println( Arrays.toString(arr));
        
        System.out.println( max(arr) );

        System.out.println( maxRange(arr,1,3) );
    }
    //Q.)max item overall array
    // imagine that arr is not empty
    static int max(int[] arr) 
    {
        if(arr.length ==0)
        {
            return -1;
        }
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max= arr[i];
            }
        }
        return max;
    }

    // Q.)find the maximum in a range
    // like askingwhat is the max element between the index 1 and index 3
    static int maxRange(int[] arr,int start,int end)
    {
        //if array is null
        //if stat==end  end>start
        if(arr==null || start<end || start==end)
        {
            return -1;
        }

        int max=arr[start];
        for (int i = start+1; i < end; i++) {
            if(arr[i]>max){
                max= arr[i];
            }
        }
        return max;
    }
}


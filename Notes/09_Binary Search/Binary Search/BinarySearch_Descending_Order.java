
class BinarySearch_Descending_Order
{
    public static void main(String[] args) 
    {
        int arr[] = { 1,2,3,4,5,6,7,8,9,10 };
        int target = 12 ;
        int ans = binarySearch(arr, target);
        System.out.println( ans );
    } 

    // return the index
    // return -1 if it doen not exist 
    static int binarySearch(int[] arr,int target )
    {
        int start =0;
        int end = arr.length-1;
        while( start <= end ) 
        {
            // find the middle element 
            // int mid = (start+end) / 2 ;  //  since when we add very large number it may go out of integer range in java 
            int mid = start + ( end-start ) / 2;

            if ( arr[mid] == target) 
            {
                return mid;
            }
            else if( arr[mid] >   target ) 
            {
                start = mid+1;
            }
            else //target < mid  
            {
                end = mid-1;
            }
        }

        // if element not found 
        return -1;
    }

}

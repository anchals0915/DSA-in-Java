// Order-Agnostic Binary Search 
// when we do not know whehter the array is sorted me in ascending or descending 
class OrderAgnosticBS
{
    public static void main(String[] args) 
    {
        // int[] arr = { -18 ,-12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int[] arr = { 99,80,75,22,11,10,5,2,-3};
        
        int target = 22;
        int ans = orderAgnosticBS(arr, target);
        System.out.println( ans );
    }

    static int orderAgnosticBS(int[] arr,int target )
    {
        int start =0;
        int end = arr.length-1;

        // find whehther the array is sorted in ascending or descending
        boolean isAsc   =   arr[start] < arr[end] ; 

        while( start <= end ) 
        {
            int mid = start + ( end-start ) / 2;

            if ( arr[mid] == target) 
            {
                return mid;
            }
            
            if(isAsc)    //Ascending order
            {
                if( arr[mid] < target ) {
                    start = mid+1;
                }
                else  {     //target < mid  
                    end = mid-1;
                }   
            }
            else    //Descending Order
            {
                if( arr[mid] > target ) {
                    start = mid+1;
                }
                else {  //target > mid  
                    end = mid-1;
                }  
            }
        }

        return -1;
    }
} 


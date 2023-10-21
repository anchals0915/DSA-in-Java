
/*  Binary Search Element */
//              target element = 36 
// 1. find the middle element 
// mid = (start + end ) /  2

//            start                          mid                                     end
//  arr  =      2,    4,      6,      9,     11,    12,     14,     20 ,     36,     48

// 2. Check whether
//         target > mid  -----------> search rigth side
//         target < mid  -------------> search left side
//         target == mid  --------->element found 

    // 36>11
//                                           mid   start                           end
//  arr  =      2,    4,      6,      9,     11,    12,     14,     20 ,     36,     48

//                                                 start           mid            end
//  arr  =      2,    4,      6,      9,     11,    12,     14,     20 ,     36,     48

// Check
    //  20 > 36
    //  20 <  36
    //  20 == 36
//                                                                  mid    start     end
//  arr  =      2,    4,      6,      9,     11,    12,     14,     20 ,     36,     48

//                                                                          start   end
//                                                                          mid    
//  arr  =      2,    4,      6,      9,     11,    12,     14,     20 ,     36,     48
// target == mid 





// Total comparisons in the worst case - Log N 



// mid = (start + end )/2          -------> since when we add very large number it may go out of integer range in java 
//     Better way to find mid  
// mid = start + (end-start)/2 

class BinarySearch_
{
    public static void main(String[] args) 
    {
        int arr[] = { -18,-12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 22;
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
            else if( arr[mid] < target ) 
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
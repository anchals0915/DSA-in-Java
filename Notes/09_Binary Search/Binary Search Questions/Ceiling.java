
/*Binary Search  */

// most of times 95 % it iwll be Binary Search
// So, first try Binary Search first

// Q.)       Celing of a number
//     arr=    [  2,       3,      5,      9,      14,     16,     18  ]
//     Ceiling = smallest element in array greter or = target 
//     ceiling ( arr, target = 14) =14
//     ceiling ( arr, target = 15) =16
//     ceiling ( arr, target = 4) = 5

// if  the question was find the = to target then it is same has binary search 
//     but, the only thin0 is that greater is also there 
// Like in previous question when we are not able to a particular index in array we were returing -1 index 
//     but in this question we have to return the next smallest element greater than target.


    // arr=    [  2,       3,      5,      9,      14,     16,     18  ]           target =15
    //          start                     mid                     end

    // arr=    [  2,       3,      5,      9,      14,     16,     18  ]           target =15
    //                                            start    mid     end
    
    // arr=    [  2,       3,      5,      9,              14                    , 16,     18  ]           target =15
    //                                           start     mid  end
    
    // arr=    [  2,       3,      5,      9,      14,               16,             18  ]           target =15 
    //                                           mid  end            start 
    // while loop breaks

    
    //**Note:   when start<=end => when while loop breaks start = end+1 
    // next big number when no answer is found = start
// which means that start is greater then end

class Ceilingarray
{
    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        System.out.println(  index_ceiling(arr, target)  );
        
    }

    // return the index : smallest element in array greter or = target 
    static int index_ceiling(int[] arr,int target)
    {
        // but what if the target is grater than the largest number  in the array 
        if( target > arr[arr.length-1])  {
            return -1;
        }

        int start=0;
        int end = arr.length-1;
        while( start <= end )
        {
            int mid = start + (end-start)/2;
            if( arr[mid] == target) {
                return mid; 
            }
            else if( arr[mid] < target)    {
                start = mid+1;
            }
            else    {
                end = mid-1;
            }
        }
        return start;
    }


}


// Q.2)     Find the floor of a number
// floor - greater number smaller or equal to target 
//     arr=    [  2,       3,      5,      9,      14,     16,     18  ]
//     floor = smallest element in array greter or = target 
//     floor ( arr, target = 14 ) =14
//     floor ( arr, target = 15 ) =14
//     floor ( arr, target = 4 ) =3

// same thing as before , just return end instead of -1
class  Floorin_array
{
    public static void main(String[] args) 
    {
        int arr[] = { 2, 3, 5, 9, 14, 16, 18};
        int target = 1;
        System.out.println(  index_floor(arr, target));
    }


    // returns tthe index : greater number smaller or equal to target 
    static int index_floor(int [] arr,int target)
    {        
        // But what if the target is smaller than the smallest element in array then there is no floor 
        //  return -1 but this will be handled automatically in the loop , it will return -1
        int start = 0;
        int end = arr.length-1;
        while( start<= end )
        {
            int mid = start + (end-start)/2;
            if( arr[mid] == target) {
                return mid;
            }
            else if(arr[mid] < target)  {
                start= mid+1;
            }   else    {
                end = mid-1;
            }
        }

        return end;
    }

}
// When condition is violated,
// start = end + 1  s>e

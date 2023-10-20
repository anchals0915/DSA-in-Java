
/*Linear Search  */

// Time Complexity:        As the size of the input is growing how is my time growing is called Time complexity

// Best Case: O(1)  constant
//     O(1) is constant time complexity

//     Worst Case : O(n)
//     You don not find the element
//     Iterate through every item and then in the end it says I did not find it 
//   O(n) is Linear time complexity 


class LinearSearch
{
    public static void main(String[] args)
    {
        int nums[] = {23,45,1,2,8,19,-3,16,-11,28};
        System.out.println( linearSearch(nums, 19 ));
    }


    // search the target , return true or false 
    static boolean linearSearch3(int [] arr , int target)
    {
        if(arr.length==-1){
            return false;
        }

        // run a for loop
        for (int element : arr) {
            if ( element == target) {
                return true ;
            }
        }

        // this line will execute if none of the return statement excute 
        return false;
    }



    // search the array return the element 
    static int linearSearch2(int [] arr , int target)
    {
        if(arr.length==-1){
            return Integer.MAX_VALUE;
        }

        // run a for loop
        for (int element : arr) {
            if ( element == target) {
                return element ;
            }
        }
        // this line will execute if none of the return statement excute 
        return Integer.MAX_VALUE;
    }



    // Search in the array : return the index if the item found 
    // otherwise if item not found return -1
    static int linearSearch(int [] arr , int target)
    {
        if(arr.length==-1){
            return -1;
        }

        // run a for loop
        for (int index = 0; index < arr.length; index++) {
            // check for element at every index if it is = target
            if (arr[index] == target) {
                return index;
            }
        }

        // this line will execute if none of the return statement excute 
        return -1;
    }
}

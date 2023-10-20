
class SearchInRange
{
    public static void main(String[] args) 
    {
        int nums[] = {18,12,-7,3, 14,28};
        System.out.println( linearSearch(nums, 3,1,4 ));
    }


    // arr = [ 18,     12,     -7,     3,      14,     28]
    //         0       1       2       3       4       5   
    // Q.)    Search 3 in the range of index [1,4]

    static int linearSearch(int [] arr , int target , int start ,int end)
    {
        if(arr.length==-1){
            return -1;
        }

        // run a for loop
        for (int index = start ; index<=end ; index++) {
            // check for element at every index if it is = target
            if (arr[index] == target) {
                return index;
            }
        }

        // this line will execute if none of the return statement excute 
        return -1;
    }
}

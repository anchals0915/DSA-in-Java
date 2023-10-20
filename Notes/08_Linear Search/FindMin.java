
class FindMin_Max_MinMaxinRange
{
    public static void main(String[] args) 
    {
        int arr[] = {18,12,-7,3, 14,28};
        System.out.println( min(arr) );
    }


    // arr = [ 18,     12,     -7,     3,      14,     28]
    //         0       1       2       3       4       5   

    static int min(int[] arr)
    {

        int min = arr[0];
        for (int element : arr) 
        {
            if(element < min)
            {
                min =element;
            }
        }
        return min;
    }
    static int minInRange(int[] arr,int start,int end)
    {
        int min = arr[0];
        for (int i = start ; i <= end; i++) {
            if( arr[i] < min){
                    min = arr[i];
            }
        }
        return min;
    }

    
    // arr = [ 18,     12,     -7,     3,      14,     28]
    //         0       1       2       3       4       5   

    static int max(int[] arr)
    {
        int max = arr[0];
        for (int element : arr) 
        {
            if(element > max)
            {
                max =element;
            }
        }
        return max;
    }
    static int maxInRange(int[] arr ,int start ,int end)
    {
        int max = arr[0];
        for (int i = start ; i <= end; i++) {
            if( arr[i] > max){
                    max = arr[i];
                }
        }
        return max;
    }
}
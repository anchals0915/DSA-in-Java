
class SearchIn2Darray
{
    public static void main(String[] args) {
        int[][] arr = {
            {23,4,1},
            {18,12,3,9},
            {78,99,34,56},
            {18,12}  };

        int target = 34;
        int[] ans = search(arr,target); //format of the return  value {row,column}


        System.out.println( maxIn2D(arr) );

    }
    static int[] search(int[][] arr,int target)
    {
        for (int row = 0; row < arr.length; row++) 
        {
            for (int col = 0; col < arr[row].length; col++) 
            {
                if( target== arr[row][col])
                {
                    return  new int[]{row,col};
                }
            }
        }

        return new int[]{-1,-1};
    }
    
    // Maximum item n 2D array
    static int maxIn2D(int[][] arr)
    {
        int max = Integer.MIN_VALUE;

        for (int[] row : arr) 
        {
            for (int element : row) 
            {
                if( max < element)
                {
                    max= element;
                }
            }
        }
        return max;
    }

    static int minIn2D(int[][] arr)
    {
        int min = Integer.MAX_VALUE;

        for (int[] row : arr) 
        {
            for (int element : row) 
            {
                if( min > element)
                {
                    min= element;
                }
            }
        }
        return min;
    }
}
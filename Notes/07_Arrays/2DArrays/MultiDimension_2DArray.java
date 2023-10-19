import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension_2DArray
{
    public static void main(String[] args) {
        // array of arrays

        /*
         * 1 2 3
         * 4 5 6
         * 7 8 9
         */
        Scanner sc=new Scanner(System.in);

        //  int[][] arr = new int[3][]; 
        // int[][] arr = {     {1,2,3},    //0th indec
        //                     {4,5},  //1st index
        //                     {6,7,8,9}   //2nd index
        //                };

        int[][]arr =new int[3][3];
        System.out.println( arr.length ); //    no of rows
        
        //input
        // 1. for( row=0 ; i< arraylength ; i++){
        // 2.          for( colum=0; column<sizeofrow ; c++){
        // 3.                  input}
        // 4.}

        for(int row=0; row<arr.length ; row++)
        {
            //for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt(); 
            }
        }

        //output
        // for(int row=0; row<arr.length ; row++)
        // {
        //     //for each col in every row
        //     for (int col = 0; col < arr[row].length; col++) {
        //         arr[row][col] = sc.nextInt(); 
        //     }
        //     System.out.println();
        // }

        for(int row=0; row<arr.length ; row++)
        {
            //for each col in every row
            System.out.println( Arrays.toString(arr[row]));
        }

        // for (int[] row : arr) {
        //     for (int col_value : row) {
        //         System.out.print(col_value+" ");
        //     }
        //     System.out.println();
        // }

        for(int[] a : arr) {
            System.out.println( Arrays.toString(a));
        }
        

    }
}

// arr ---------->[ [1,2,3],
//                 [4,5,6],
//                  [7,8,9] ]


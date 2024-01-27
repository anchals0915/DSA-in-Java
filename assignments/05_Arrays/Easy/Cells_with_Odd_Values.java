/**
 * Problem: Cells with Odd Values in a Matrix
 * Difficulty: Easy
 * 
 * Topics:
 * - Array
 * - Matrix
 * 
 * There is an m x n matrix that is initialized to all 0's.
 * There is also a 2D array indices where each indices[i] = [ri, ci] represents
 * a 0-indexed location to perform
 * some increment operations on the matrix.
 * 
 * For each location indices[i], do both of the following:
 * - Increment all the cells on row ri.
 * - Increment all the cells on column ci.
 * 
 * Given m, n, and indices, return the number of odd-valued cells in the matrix
 * after applying the increment to all locations in indices.
 * 
 * Example 1:
 * Input: m = 2, n = 3, indices = [[0,1],[1,1]]
 * Output: 6
 * Explanation: Initial matrix = [[0,0,0],[0,0,0]].
 * After applying first increment it becomes [[1,2,1],[0,1,0]].
 * The final matrix is [[1,3,1],[1,3,1]], which contains 6 odd numbers.
 * 
 * Example 2:
 * Input: m = 2, n = 2, indices = [[1,1],[0,0]]
 * Output: 0
 * Explanation: Final matrix = [[2,2],[2,2]]. There are no odd numbers in the
 * final matrix.
 * 
 * Constraints:
 * 1 <= m, n <= 50
 * 1 <= indices.length <= 100
 * 0 <= ri < m
 * 0 <= ci < n
 */
class Solution {
    public int oddCells(int n, int m, int[][] indices) {
        int count = 0;
        int row[] = new int[n];
        int col[] = new int[m];
        for (int x[] : indices) {
            row[x[0]]++;
            col[x[1]]++;
        }
        for (int i = 0; i < n; i++) // for ( int i = 0 ; i < number of colums ; i++ )
        {
            for (int j = 0; j < m; j++) // for( int j = 0 ; j< number of rows ; j++ )
            {
                if ((row[i] + col[j]) % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }
}

class Solution1 {

    // this beats 80%
    /*
     * static int helper(int m, int n, int arr[][]){
     * int a[][] = new int[m][n];
     * 
     * for(int i=0; i<arr.length; i++){
     * int r = arr[i][0];
     * int c = arr[i][1];
     * for(int j=0; j<n; j++){
     * a[r][j]++;
     * }
     * 
     * for(int j=0; j<m; j++){
     * a[j][c]++;
     * }
     * }
     * 
     * int ans = 0;
     * 
     * for(int i=0; i<m; i++){
     * for(int j=0; j<n; j++){
     * if(a[i][j]%2!=0) ans++;
     * }
     * }
     * 
     * return ans;
     * 
     * }
     * 
     */
    public int oddCells(int m, int n, int[][] indices) {

        int[] rows = new int[m];
        int[] cols = new int[n];

        // rows
        for (int[] rc : indices) {
            rows[rc[0]]++;
            cols[rc[1]]++;
        }

        int oddRows = 0;
        for (int row : rows) {
            if (row % 2 == 1) {
                oddRows++;
            }
        }
        int oddCols = 0;
        for (int col : cols) {
            if (col % 2 == 1) {
                oddCols++;
            }
        }

        int odds = (oddRows * n) + (oddCols * m);
        int evensFromCrossOver = oddRows * oddCols;
        if (odds > 0 && oddRows > 0 && oddCols > 0) {
            // Since the odds and evens are BOTH incremented, you need to decrement this
            // count twice.
            odds = odds - (2 * evensFromCrossOver);
        }

        return odds;
    }

    public int oddCells2(int n, int m, int[][] indices) {
        boolean[] oddRows = new boolean[n], oddCols = new boolean[m];
        for (int[] idx : indices) {
            oddRows[idx[0]] ^= true;
            oddCols[idx[1]] ^= true;
        }
        int cnt = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                cnt += oddRows[i] ^ oddCols[j] ? 1 : 0;
            }
        }
        return cnt;
    }
}

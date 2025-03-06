class Solution {
  
         public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        int k = n - 1; // Initialize k to the last column index

        for (int i = 0; i < n; i++) {
        
            sum += mat[i][i];

            // Secondary diagonal
            sum += mat[i][k];

            // Avoid double counting the center element in odd-sized matrices
            if (i == k) {
                sum -= mat[i][k];
            }

            k--; // Decrement k for the next row
        }
        return sum;
    

    }
}

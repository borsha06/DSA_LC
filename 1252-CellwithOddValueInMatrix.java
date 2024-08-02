class Solution {
    public int oddCells(int m, int n, int[][] indices) {

        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = 0;
            }
        }
        for (int i = 0; i < indices.length; i++) {
            int row = indices[i][0];
            int column = indices[i][1];
            for (int j = 0; j < n; j++) {
                matrix[row][j] += 1;
            }
            for (int k = 0; k < m; k++) {
                matrix[k][column] += 1;
            }
        }
        int c = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] % 2 != 0) {
                    c++;
                }
            }
        }
        return c;
    }
}
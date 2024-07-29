class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;

        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i];
            sum += mat[i][(mat.length - 1) - i];

        }
        if (mat.length % 2 != 0) {
            int l = mat.length;
            return sum - mat[l / 2][l / 2];
        } else
            return sum;

    }
}
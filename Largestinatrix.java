class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] maxArr = new int[n - 2][n - 2];

        for (int i = 0; i < n - 2; i++) {
            for (int l = 0; l < n - 2; l++) {
                int max = -1;
                for (int j = i; j < i + 3; j++) {
                    for (int k = l; k < l + 3; k++) {

                        if (grid[j][k] >= max) {
                            max = grid[j][k];
                        }
                    }
                    maxArr[i][l] = max;
                }
            }

        }
        return maxArr;
    }
}
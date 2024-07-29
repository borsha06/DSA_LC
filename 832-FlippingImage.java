class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        int[][] flipped = flip(image);
        return invert(flipped);

    }

    public int[][] flip(int[][] arr) {
        int n = arr.length;
        int[][] rev = new int[n][n];
         for (int i = 0; i < n; i++) {
            for (int j = 0; j <n ; j++) {
                int l = arr.length;
                rev[i][j] = arr[i][(n-1)-j];
            }
        }
        return rev;

    }

    public int[][] invert(int[][] arr) {
        int n = arr.length;
         for (int i = 0; i < n; i++) {
            for (int j = 0; j <n ; j++) {
                if(arr[i][j] == 1){
                    arr[i][j] = 0;
                }
                else {
                    arr[i][j] = 1;
                }
            }
        }
        return arr;

    }

}
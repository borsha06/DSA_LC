class Solution {
    public int heightChecker(int[] heights) {

        int[] heightsOriginal = heights.clone();

        Arrays.sort(heights);
        int count = 0;

        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != heightsOriginal[i]) {
                count++;
            }
        }
        return count;

    }
}
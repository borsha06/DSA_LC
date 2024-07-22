class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] xAxis = new int[points.length];

        for (int i = 0; i < points.length; i++) {
            System.out.println(points[i][0]);
            xAxis[i] = points[i][0];
        }
        Arrays.sort(xAxis);
        int count = -1;
        for (int i = xAxis.length - 1; i > 0; i--) {
            
            int diff = xAxis[i] - xAxis[i - 1];
            if (diff > count) {
                count = diff;
            }
        }
        return count;

    }
}
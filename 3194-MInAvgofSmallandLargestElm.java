class Solution {
    public double minimumAverage(int[] nums) {
        int l = nums.length;
        Arrays.sort(nums);
        int minEl = 0;
        int maxEl = 0;
        double minimum = 99999;
        for (int i = 0; i < (l / 2); i++) {

            minEl = nums[i];
            maxEl = nums[(l - 1) - i];
            double avg = (minEl + maxEl) / 2.0;
            if (avg < minimum) {
                minimum = avg;
            }
        }
        return minimum;
    }
}
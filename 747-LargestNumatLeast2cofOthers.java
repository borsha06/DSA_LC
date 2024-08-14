class Solution {
    public int dominantIndex(int[] nums) {
        int max = -1;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        int c = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] * 2 <= max) {
                c++;
            } else {
                return -1;
            }
        }
        return index;

    }
}
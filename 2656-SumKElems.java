class Solution {
    public int maximizeSum(int[] nums, int k) {

        Arrays.sort(nums);

        int heighest = nums[nums.length - 1];
        int sum = heighest;

        for (int i = 0; i < k - 1; i++) {
            heighest++;
            sum += heighest;
        }
        return sum;

    }
}
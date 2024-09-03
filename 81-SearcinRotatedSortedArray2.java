class Solution {
    public boolean search(int[] nums, int target) {
        Arrays.sort(nums);
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = (high + low) / 2;
            if (target == nums[mid])
                return true;
            else if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            }
        }
        return false;

    }

}
class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int mid = 0;
        while (low <= high) {
            mid = low + ((high - low) / 2);
            if (target == nums[mid])
                return mid;
            else if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            }
        }
        return -1;
        
    }
}
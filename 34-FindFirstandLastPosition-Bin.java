class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = findFirst(nums, target);
        res[1] = findLast(nums, target);
        return res;

    }

    public int findFirst(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid = -1;
        int first = -1;
        while (low <= high) {
            mid = low + ((high - low) / 2);
            if (target == nums[mid]) {
                first = mid;
                high = mid -1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            }
        }
        return first;

    }

    public int findLast(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid = -1;
        int last = -1;
        while (low <= high) {
            mid = low + ((high - low) / 2);
            if (target == nums[mid]) {
                last = mid;
                low = mid + 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            }
        }
        return last;

    }

}
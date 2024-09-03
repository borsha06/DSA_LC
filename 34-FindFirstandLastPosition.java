class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = { -1, -1 };
        int low = 0;
        int high = nums.length - 1;
        int mid = -1;
        while (low <= high) {
            mid = low + ((high - low) / 2);
            if (target == nums[mid]) {
                break;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            }
        }
        System.out.println(mid);
        if (mid == -1 || low > high) {
            return res;
        } else {
            for (int i = 0; i <= mid; i++) {
                if (nums[i] == nums[mid]) {
                    res[0] = i;
                    break;
                }
            }
            for (int i = nums.length - 1; i >= mid; i--) {
                if (nums[i] == nums[mid]) {
                    res[1] = i;
                    break;
                }
            }
            return res;
        }

    }

}
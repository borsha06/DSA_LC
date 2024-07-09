class Solution {
    public int minimumOperations(int[] nums) {
        int counter = 0;
        int unchecked = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 3 == 0) {
                continue;
            } else {
                if (checking(nums[i])) {
                    counter += 1;
                }
            }
        }
        return counter;
    }

    public boolean checking(int n) {
        if ((n + 1) % 3 == 0 || (n - 1) % 3 == 0) {
            return true;
        } else
            return false;
    }
}
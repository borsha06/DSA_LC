class Solution {
    public int countKDifference(int[] nums, int k) {
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i ; j < nums.length; j++) {
                if((i <j) && Math.abs(nums[i] - nums[j]) == k){
                    c++;
                }
            }
        }
        return c;
    }
}
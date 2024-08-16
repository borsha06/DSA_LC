class Solution {
    public int removeElement(int[] nums, int val) {

        int index = 0;
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                c++;
                continue;
            } else {
                nums[index] = nums[i];
                index++;
            }
        }
        return nums.length - c;
    }
}
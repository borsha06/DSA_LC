class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                c++;
                continue;
            } else {
                nums[index] = nums[i];
                index++;
            }
            
        }
        
        while (c != 0 && index < nums.length) {

            nums[index] = 0;
            index++;
            c--;

        }
    }
}
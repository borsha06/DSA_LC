class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int countOne = 0;
        int countPos = 0;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == 1) {
                countOne++;
                countPos = Math.max(countPos, countOne);
            } else if (nums[i] == 0) {
                countOne = 0;
            }
            i++;
        }
        return countPos;

    }
}
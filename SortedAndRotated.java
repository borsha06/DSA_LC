import java.util.Arrays;

class Solution {
    public boolean check(int[] nums) {

        int[] origNums = nums.clone ();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int[] arrayLists = rotate(nums);
            int c = 0;
             for (int k = 0; k < origNums.length; k++) {
        }
            for (int j = 0; j < arrayLists.length; j++) {
    
                if (arrayLists[j] == origNums[j]) {
                    c++;
                }
            }
            if (c == nums.length) {
                return true;
            }
        }
        return false;
    }

    public int[] rotate(int[] nums) {

        int first = nums[0];

        for (int i = 0; i < nums.length - 1; i++) {

            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = first;

        return nums;
    }
}
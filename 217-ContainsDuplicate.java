class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashMap<Integer, Integer> numsMap = new HashMap<>();

           for (int i = 0; i < nums.length; i++) {
            if (numsMap.containsKey(nums[i]) == false) {
                numsMap.put(nums[i], 1);
            } else if (numsMap.containsKey(nums[i]) == true) {
                return true;
            }
        }
        return false;
        
    }
}
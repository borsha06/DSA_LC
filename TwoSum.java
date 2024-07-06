class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> literalMap = new HashMap<>();
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if (literalMap.containsKey(target - nums[i])) {
                return new int[] { literalMap.get(target - nums[i]), i };

            } else {
                literalMap.put(nums[i], i);
            }

        }
        return result;
    }

}

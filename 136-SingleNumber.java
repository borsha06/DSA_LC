import java.util.Map.Entry;

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> numsMap = new HashMap<>();
        int num = 0;

        for (int i = 0; i < nums.length; i++) {
            if (numsMap.containsKey(nums[i]) == false) {
                numsMap.put(nums[i], 1);
            } else if (numsMap.containsKey(nums[i]) == true) {
                int value = numsMap.get(nums[i]);
                numsMap.put(nums[i], value += 1);
            }
        }
        for (Entry<Integer, Integer> entry : numsMap.entrySet()) {
            if (entry.getValue() == 1) {
                num = entry.getKey();
                System.out.println("The key for value " + num + " is " + entry.getKey());
                break;
            }
        }
        return num;

    }
}
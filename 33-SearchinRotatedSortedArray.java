class Solution {
    public int search(int[] nums, int target) {

        Map<Integer, Integer> values = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            if(values.containsKey(nums[i]) == false){
                values.put(nums[i], i);
            }
        }
        System.out.println(values);
        Arrays.sort(nums);
        int low = 0;
        int high = nums.length-1;
        int mid = 0;
        while (low <= high) {
            mid = (high + low) / 2;
            if (target == nums[mid])
                return values.get(target);
            else if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            }
        }
        return -1;
        
    }
}
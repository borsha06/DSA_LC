class Solution {
    public int pivotIndex(int[] nums) {

        int middle = nums.length-1;
        List<Integer> index = new ArrayList<Integer>();
        while (middle > -1) {
            int left = 0;
            int right = 0;
            for (int i = 0; i <= middle - 1; i++) {
                left += nums[i];
            }
            for (int i = middle + 1; i < nums.length; i++) {
                right += nums[i];
            }
            if (left == right) {
                index.add(middle);
                middle -= 1;
            } else {
                middle -= 1;
            }
        }
        if (index.size() > 0) {
            Collections.sort(index);
            return index.get(0);
        }
        return -1;

    }
}
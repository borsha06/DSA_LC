class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        List<Integer> v = new ArrayList<>();
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                v.add(c);
            }
            if (nums[i] == 1) {
                c++;
                if (i == nums.length - 1) {
                    v.add(c);
                }
            } else if (nums[i] == 0) {
                v.add(c);
                c = 0;
            }
        }
        Collections.sort(v);
        return v.get(v.size() - 1);

    }
}
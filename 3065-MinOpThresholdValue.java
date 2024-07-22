class Solution {
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        ArrayList<Integer> clist = new ArrayList<>();

        for (int i : nums) {
            if (i < k) {
                clist.add(i);
            }
        }

        return clist.size();

    }
}
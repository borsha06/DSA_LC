class Solution {
    public int[] decompressRLElist(int[] nums) {

        List<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i< nums.length/2; i++){
            int freq = nums[2*i];
            int val = nums[2*i+1];
            for(int j = 0; j<freq; j++){
                result.add(val);
            }

        }
          
        int[] arr = result.stream().mapToInt(i -> i).toArray();
        return arr;
    }
}
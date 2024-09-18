class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int[] left = new int [nums.length];
        int[] right = new int [nums.length];
        int[] ans = new int [nums.length];
        if(nums.length <2){
            left[0]=0;
        }
        else
        {
        int sum = 0;
        left[0]=0;
        for(int i=0;i<nums.length-1;i++){
            sum+=nums[i];
            left[i+1] = sum;
        }
        sum = 0; 
        right[nums.length-1]=0;
        for(int i=nums.length-1;i>0;i--){
            sum+=nums[i];
            right[i-1] = sum;
        }
         for(int i=0;i<nums.length;i++){
            ans[i] = Math.abs(left[i] - right[i]);
        }
        
        }
        return ans;
        
    }
}
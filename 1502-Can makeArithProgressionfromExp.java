class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int diff;
        boolean v = true;
        
        Arrays.sort(arr);
        
        diff = Math.abs(arr[0] - arr[1]);
        for(int i = 1; i <= arr.length-2; i++) {
           int diff_2 = Math.abs(arr[i+1] - arr[i]);
            if(diff != diff_2){
                return false;
            }
            
        }
        return true;
        
    }
}
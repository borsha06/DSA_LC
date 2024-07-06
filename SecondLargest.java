class Solution {
    public int print2largest(List<Integer> arr) {
        // Code Here
        arr.sort(null);
        int largest = arr.get(arr.size()-1);
        
        int second = -1;
        for(int i =0; i<arr.size(); i++){
            if(arr.get(i) > second && arr.get(i)< largest){
                second = arr.get(i);
            }
        }
        
        return second;
    }
}
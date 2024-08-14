class Solution {
    public int[] finalPrices(int[] prices) {
        int[] finalPrice = new int[prices.length];

        for(int i = 0; i < prices.length; i++){
            for(int j = i+1; j< prices.length; j++){
                if(prices[j] <= prices[i]){
                    int diff = Math.abs(prices[j] - prices[i]);
                    prices[i] = diff; 
                    j = prices.length;
                }
                else {
                    continue;
                }
            }
        }
        return prices;
    }
}
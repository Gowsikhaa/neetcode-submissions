class Solution {
    public int maxProfit(int[] prices) {
        int i =0,end=prices.length,max=0, min = prices[0];
        while(i<end){
            max = Math.max(max,prices[i] - min);
            min = Math.min(min,prices[i]);
            i++;
        }
        return max;
    }
}

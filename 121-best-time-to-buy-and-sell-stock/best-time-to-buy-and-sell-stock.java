class Solution {
    public int maxProfit(int[] prices) {
        int minBuyPrice=prices[0];
        int currentProfit=0;
        int maxProfit=0;


        for(int i=1;i<prices.length;i++){
            if(minBuyPrice>prices[i]){
                minBuyPrice=prices[i];
            }else{
                currentProfit=prices[i]-minBuyPrice;
                maxProfit=Math.max(maxProfit,currentProfit);
            }
        }
        return maxProfit;
    }

}
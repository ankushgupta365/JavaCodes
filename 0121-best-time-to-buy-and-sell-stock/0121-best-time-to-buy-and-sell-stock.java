class Solution {
    public int maxProfit(int[] prices) {
        int mp = Integer.MAX_VALUE;
        int p = 0;
        for(int i=0; i<prices.length; i++){
            if(mp>prices[i]){
                mp=prices[i];
            }
           else if(p<prices[i]-mp){
                p=prices[i]-mp;
            }
        }
        return p;
    }
}
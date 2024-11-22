class Solution {
    public int maximumProfit(int prices[]) {
        int n=prices.length;
        int[] max=new int[n];
        max[n-1]=prices[n-1];
        int maxp=0;
        for(int i=n-2;i>=0;i--){
            max[i]=Math.max(prices[i],max[i+1]);
            maxp=Math.max(maxp,max[i]-prices[i]);
            
        }
        
        return maxp;
        // Code here
    }
}

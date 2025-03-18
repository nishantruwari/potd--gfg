class Solution {
    static boolean equalPartition(int arr[]) {
        // code here
        int sum=0;
        for(int i: arr){
            sum+=i;
        }
        int n=arr.length;
        
        if(sum%2==1){
            return false;
        }
        boolean[][] dp=new boolean[n][sum/2+1];
        
        return helper(arr,n,0,sum/2,dp);
    }
    
    static boolean helper(int[] arr,int n,int i,int target,boolean[][] dp){
        if(i>=n || target<0){
            return false;
        }
        
        if(target==0){
            return true;
        }
        
        if(dp[i][target]){
            
            return dp[i][target];
            
        }
        
        
        return dp[i][target]=helper(arr,n,i+1,target-arr[i],dp)|| helper(arr,n,i+1,target,dp);
    }
}

class Solution {
    public long maxSum(Long[] arr) {
        // code here
        
        Arrays.sort(arr);
        long ans=0;
        int n=arr.length;
        
        for(int i=0;i<arr.length;i++){
            ans+=Math.abs(arr[n-i-1]-arr[i]);
        }
        return ans;
    }
}

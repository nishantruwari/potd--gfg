class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int[] arr) {
        
        int sum=arr[0];
        int maxsum=arr[0];
        for(int i=1;i<arr.length;i++){
            if(sum<0){
                sum=0;
            }
            sum=sum+arr[i];
            maxsum=Math.max(sum,maxsum);
        }
        return maxsum;

        // Your code here
    }
}

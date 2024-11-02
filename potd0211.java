class Solution {
    public boolean checkDuplicatesWithinK(int[] arr, int k) {
        // your code
        int i;
        for(i=0;i<arr.length-k;i++){
            int target=arr[i];
            for(int j=i+1;j<=i+k;j++){
                if(arr[j]==target){
                    return true;
                }
            }
            
        }
        
        for(;i<arr.length-1;i++){
            int target=arr[i];
            for(int j=i+1; j<arr.length;j++){
                if(target==arr[j]){
                    return true;
                }
            }
            
        }
        return false;
    }
}

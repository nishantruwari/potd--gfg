class Solution {
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr) {
        
        Arrays.sort(arr);
        int n=arr.length;
        
        int i=0;
        for(;i<n;i++){
            
            if(arr[i]>0){
                break;
            }
            
        }
        
        int count=1;
        for(;i<n;i++){
            
            if(arr[i]!=count){
                return count;
            }else{
                while(arr[i]==count){
                    ++i;
                    if(i==n) break;
                }
                --i;
            }
            
            ++count;
        }
        
        return count;
        // Your code here
    }
}

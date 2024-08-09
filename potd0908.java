class Solution {

    int Maximize(int arr[]) {
     Arrays.sort(arr);
     long ans=0;
     for(int i=0;i<arr.length;i++){
        
         ans+=(long)arr[i]*i;
         ans%=1000000007;
     }
     return (int)ans;
          
             // Complete the function
     }
 }
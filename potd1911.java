class Solution {
    
    public static void rev(int[] arr, int start,int end){
        int n=arr.length;
        
        for(int i=start,j=end-1;i<=j;i++,j--){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            
        }
    }
    void nextPermutation(int[] arr) {
        int n=arr.length;
        int index=-1;
        
        
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                 index=i;
                
                for(int j=n-1;j>index;j--){
                    if(arr[j]>arr[index]){
                        int temp=arr[j];
                        arr[j]=arr[index];
                        arr[index]=temp;
                        break;
                    }
                }
                break;
            }
        }
        
        if(index==-1){
            Arrays.sort(arr);
        }else{
            rev(arr,index+1,n);
        }
        // code here
    }
}

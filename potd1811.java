class Solution {
    
    public static void rev(int[] arr,int start,int end){
        for(int i=start,j=end-1;i<=j;i++,j--){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        
        int n=arr.length;
        d=d%n;
        rev(arr,0,d);
       rev(arr,d,n);
       
       rev(arr,0,n);
        // add your code here
    }
}

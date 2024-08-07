class Solution {
    public long kthElement(int z, int arr1[], int arr2[]) {
        
        int m=arr1.length;
        int n=arr2.length;
        int com[]=new int[m+n];
        
        int k=0,i=0,j=0;
        int ans=-1,flag=0;
        while(i<m &&j<n){
            if(arr1[i]<arr2[j]){
                com[k]=arr1[i];
                ++i;
                ++k;
                
            }else{
                com[k]=arr2[j];
                ++j;
                ++k;
                
                
            }
        }
        
        int l=i==m?j:i;
        int b=i==m?n:m;
        for(int v=l;v<b;v++  ){
            com[k]=i==m?arr2[v]:arr1[v];
            ++k;
            
        }
        return com[z-1];
        
    }
}
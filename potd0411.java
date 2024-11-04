class Solution {
    public List<List<Integer>> findTriplets(int[] arr) {
        
        List<List<Integer>> ans=new ArrayList<>();
        int n=arr.length;
        
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        List l=new ArrayList<>();
                        l.add(i);
                        l.add(j);
                        l.add(k);
                        ans.add(l);
                    }
                    
                }
            }
        }
        return ans;
        // Your code here
    }
}

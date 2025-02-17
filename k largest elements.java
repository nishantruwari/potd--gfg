class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        // Your code here
        
        Arrays.sort(arr);
        int n=arr.length;
        
        ArrayList<Integer> res=new ArrayList<>();
        int  i=n-1;
        
        for(int count=0;count<k;count++){
            res.add(arr[i]);
            --i;
        }
        
        return res;
    }
}

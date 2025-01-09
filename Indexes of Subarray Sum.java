class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        
        ArrayList<Integer> list=new ArrayList<>();
        
        int s=0,e=0,sum=0;
        
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            //sum<target  -> ignore
            e=i;
            
            while(sum>target){
                sum-=arr[s];
                ++s;
            }
            
            if(sum==target){
                list.add(s+1);
                list.add(e+1);
                return list;
            }
            
        }
        list.add(-1);
        return list;
        // code here
    }
}

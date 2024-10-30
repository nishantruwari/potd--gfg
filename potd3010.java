class Solution {
    int countPairsWithDiffK(int[] arr, int k) {
        // code here
        
        int n=arr.length;
        int count=0;
        Arrays.sort(arr);
       //Set<Integer> set = new HashSet<>();
       HashMap<Integer,Integer> map=new HashMap<>();
       
       for(int i=0;i<n;i++){
          if(arr[i]>=k&& map.containsKey(arr[i]-k)){
              count+=map.get(arr[i]-k);
          }
           map.put(arr[i],map.getOrDefault(arr[i],0)+1);
       }
        
        return count;
    }
}

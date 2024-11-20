class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        
        int n=nums.length;
      
        
        int threeshold=(int)Math.ceil(n/3.0);
        if(n%3==0) ++threeshold;
       //System.out.println(threeshold);
        List<Integer> ans=new ArrayList<>();
        
        HashMap<Integer,Integer> map=new HashMap<>();
        //  PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->(map.get(b)-map.get(a)));
        
        for(int i =0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        for(Map.Entry<Integer,Integer> ele:map.entrySet()){
            
            int key=ele.getKey();
            int value=ele.getValue();
            
            
            
            if(map.get(key)>=threeshold){
                ans.add(key);
            }
          //  pq.add(key);
       //     System.out.println(key+" "+value);
           
            
            
        }

        
        //Collections.sort(ans);
        
        return ans;
        
    }
}

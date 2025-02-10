class Solution {
    
    void solve(HashMap<Integer,Integer> map,Node root,int k , int[] count,int currsum){
        if(root ==null) return ;
        currsum+=root.data;
        if(currsum==k){
            ++count[0];
        }
        
            if(map.containsKey(currsum-k)){
                count[0]+=map.get(currsum-k);
            }
        
        map.put(currsum,map.getOrDefault(currsum,0)+1);
        solve(map,root.left,k,count,currsum);
        solve(map,root.right,k,count,currsum);
        map.put(currsum,map.get(currsum)-1);
        
    }
    public int sumK(Node root, int k) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        
        int[] count=new int[1];
        solve(map,root,k,count,0);
        return count[0];
        // code here
    }
}

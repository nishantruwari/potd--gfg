class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        
        Queue<Node> q=new LinkedList<>();
        
        q.add(root);
        q.add(null);
        
        ArrayList<Integer> list=new ArrayList<>();
        
        while(!q.isEmpty()){
            Node curr=q.poll();
            
            if(curr==null){
                ans.add(list);
                if(q.isEmpty()){
                    
                    break;
                }else{
                  
                    list=new ArrayList<>();
                    q.add(null);
                    
                }
            }else{
                list.add(curr.data);
                if(curr.left!=null) q.add(curr.left);
                 if(curr.right!=null) q.add(curr.right);
                
            }
            
        }
        return ans;
        
        
        // Your code here
    }
}

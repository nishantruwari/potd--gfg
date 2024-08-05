class Solution
{
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        //import javafx.util.Pair;
        ArrayList<Integer> ans=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        Queue<Node> q=new LinkedList<>();
        root.hd=0;
        q.add(root);
        int min=0,max=0;
        //q.offer(new Pair<>(root,0));
        while(!q.isEmpty()){
            Node temp=q.remove();
            
            //Node n=temp;
            int level=temp.hd;
            
            map.put(level,temp.data);
            min=Math.min(temp.hd,min);
            max=Math.max(temp.hd,max);
            
            if(temp.left!=null){
                temp.left.hd=temp.hd-1;
                q.add(temp.left);
            }
            if(temp.right!=null){
                temp.right.hd=temp.hd+1;
                q.add(temp.right);
            }
        }
        for(int i=min;i<=max;i++){
            ans.add(map.get(i));
        }
        return ans;
        
    }
}
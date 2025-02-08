class Solution {
    ArrayList<Integer> boundaryTraversal(Node node) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        if(!isLeafNode(node)){
            
       
            res.add(node.data);
        }
        
        
            leftBoundary(node.left,res);
            leaf(node,res);
            rightBoundary(node.right,res);
        
        return res;
    }
    
    boolean isLeafNode(Node node){
        return (node.left==null && node.right==null);
    }
    
    void leftBoundary(Node node, ArrayList<Integer> res){
        if(node==null) return;
        
//if(isLeafNode(node)) return;
       // res.add(node.data);
        while(node!=null){
            if(isLeafNode(node)) break;
            res.add(node.data);
            if(node.left!=null){
                node=node.left;
            }else{
                node=node.right;
            }
            
        }
    }

    void rightBoundary(Node node, ArrayList<Integer> res){
        if(node==null) return;
        Stack<Integer> stack=new Stack<>();
        
//if(isLeafNode(node)) return;
        //res.add(node.data);
        while(node!=null){
            if(isLeafNode(node)) break;
            stack.push(node.data);
            if(node.right!=null){
                node=node.right;
            }else{
                node=node.left;
            }
            
        }
        
        while(!stack.isEmpty()){
            res.add(stack.pop());
        }
    }
    
    void leaf(Node node, ArrayList<Integer> res){
        if(node==null) return;
        if(isLeafNode(node)){
            res.add(node.data);
            
        }
        leaf(node.left,res);
        leaf(node.right,res);
    }
}

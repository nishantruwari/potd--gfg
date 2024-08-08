class Solution {
    
    
    int traverse(Node root){
        if(root==null) return 0;
        int left=traverse(root.left);
        int right=traverse(root.right);
        return root.data+left+right;
    }
    boolean isSumTree(Node root) {
        
        if(root==null) return true;
        if(root.left==null && root.right==null) return true;
        if(root.left!=null || root.right!=null){
            if(root.data!=traverse(root.left)+traverse(root.right)){
                return false;
            }
        }
        return isSumTree(root.left)&&isSumTree(root.right);
        // Your code here
    }
}

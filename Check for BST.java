class Solution {
    // Function to check whether a Binary Tree is BST or not.
    void inorder(Node root,ArrayList<Integer> arr){
        if(root==null ) return;
        
        inorder(root.left,arr);
        arr.add(root.data);
        inorder(root.right,arr);
        return;
    }
    
    boolean isSorted(ArrayList<Integer> arr){
        int n=arr.size();
        for(int i=0;i<n-1;i++){
            if(arr.get(i+1)<arr.get(i)){
                return false;
            }
            
        }
        return true;
    }
    boolean isBST(Node root) {
        
        ArrayList<Integer> arr=new ArrayList<>();
        inorder(root,arr);
        // code here.
        return isSorted(arr);
    }
    
    
}

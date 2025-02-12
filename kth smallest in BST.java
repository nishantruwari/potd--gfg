class Solution {
    public void inorder(Node root,ArrayList<Integer> arr){
        if(root== null) return ;
        inorder(root.left,arr);
        arr.add(root.data);
        inorder(root.right,arr);
    }
    // Return the Kth smallest element in the given BST
    public int kthSmallest(Node root, int k) {
        ArrayList<Integer> arr=new ArrayList<>();
        inorder(root,arr);
        int n=arr.size();
        if(n<k) return -1;
        return arr.get(k-1);
        // Write your code here
    }
}

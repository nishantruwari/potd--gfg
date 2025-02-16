class Tree {
    // Function to serialize a tree and return a list containing nodes of tree.
    public void preorder(ArrayList<Integer> arr, Node root){
        if(root== null){
            
            arr.add(-1);
            return ;
        }
        arr.add(root.data);
        preorder(arr,root.left);
        
        preorder(arr,root.right);
       // return;
    }
    public ArrayList<Integer> serialize(Node root) {
        ArrayList<Integer> arr=new ArrayList<>();
        
        preorder(arr,root);
        return arr;
        // code here
    }
    
    int i=0;
    // Function to deserialize a list and construct the tree.
    public Node deSerialize(ArrayList<Integer> arr) {
       int val=arr.get(i);
       i++;
       if(val==-1){
           return null;
       }
        Node node=new Node(val);
        node.left=deSerialize(arr);
        node.right=deSerialize(arr);
        
        return node;
        // code here
    }
};

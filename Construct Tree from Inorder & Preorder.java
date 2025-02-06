class Solution {
    
    
    private static Node solve(int inorder[], int preorder[],int[] idx,int start,int end){
        if(start>end) return null;
        
        int rootVal=preorder[idx[0]];
        int i;
        for( i=start;i<=end;i++){
            if(inorder[i]==rootVal){
                break;
            }
        }
        idx[0]+=1;
        
        
        Node root=new Node(rootVal);
        root.left=solve(inorder,preorder,idx,start,i-1);
        root.right=solve(inorder,preorder,idx,i+1,end);
        return root;
        
    }
    public static Node buildTree(int inorder[], int preorder[]) {
        int n=preorder.length;
        int[] idx=new int[1];
        idx[0]=0;
        
        return solve(inorder,preorder,idx,0,n-1);
        // code here
    }
}

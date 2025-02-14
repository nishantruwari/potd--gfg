class Solution {
    void inorder(Node root,ArrayList<Integer> inorderList){
        if(root== null){
            return ;
            
        }
        inorder(root.left,inorderList);
        inorderList.add(root.data);
        inorder(root.right,inorderList);
        return;
    }
    
    void buildBST(Node root,ArrayList<Integer> inorderList,int[] i){
        if(root ==null ){
            return;
        }
        buildBST(root.left,inorderList,i);
        root.data=inorderList.get(i[0]);
        i[0]++;
        buildBST(root.right,inorderList,i);
        return;
    }
    void sort(ArrayList<Integer> inorderList){
        int n=inorderList.size();
        int l=-1;
        int r=-1;
        
        for(int i=0;i<n-1;i++){
            if(inorderList.get(i)>inorderList.get(i+1)){
                if(l==-1){
                    l=i;
                }
                   
                    r=i+1;
                
            }
        }
        
        int temp=inorderList.get(l);
        inorderList.set(l,inorderList.get(r));
        inorderList.set(r,temp);
        
        return;
    }
    
    void correctBST(Node root) {
        ArrayList<Integer> inorderList=new ArrayList<>();
        
        inorder(root,inorderList);
        //Collections.sort(inorderList); //complexity O(nlogn)
        sort(inorderList);
        int[] i=new int[1];
        
        buildBST(root,inorderList,i);
        return ;
        // code here.
    }
}

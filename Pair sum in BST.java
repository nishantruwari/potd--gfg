class Solution {
    void inorder(Node root,ArrayList<Integer> arr,HashMap<Integer,Integer> set){
        if(root==null ) return;
        inorder(root.left,arr,set);
        arr.add(root.data);
        set.put(root.data,set.getOrDefault(root.data,0)+1);
        inorder(root.right,arr,set);
        return ;
    }
    boolean findTarget(Node root, int target) {
        
        ArrayList<Integer> arr=new ArrayList<>();
        HashMap<Integer,Integer> set=new HashMap<>();
        inorder(root,arr,set);
        // HashMap<Integer,Integer
        
        for(int i=0;i<arr.size();i++){
            if((target-arr.get(i))==arr.get(i)&& set.get(arr.get(i))>1){
                return true;
            }
            if((target-arr.get(i))!=arr.get(i) &&set.containsKey(target-arr.get(i))){
                return true;
            }
        }
        
        return false;
        // Write your code here
    }
}

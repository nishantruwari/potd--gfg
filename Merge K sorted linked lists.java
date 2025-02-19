class Solution {
    // Function to merge K sorted linked list.
    Node mergeKLists(List<Node> arr) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.size();i++){
            Node node=arr.get(i);
            while(node!=null){
                list.add(node.data);
                node=node.next;
            }
        }
        
        Collections.sort(list);
        
        Node root=new Node(list.get(0));
        Node first=root;
        for(int i=1;i<list.size();i++){
            Node curr=new Node(list.get(i));
            root.next=curr;
            root=curr;
        }
        
        return first;
        // Add your code here.
    }
}

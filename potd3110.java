class Solution {
    public Node sortedInsert(Node head, int x) {
        
       
        Node r=head;
                //insertion in first
        if(r.data>x){
            Node temp=new Node(x);
            temp.next=r;
            r.prev=temp;
            head=temp;
            return head;
        }
        
        //1 node
        if(head.next==null){
            Node temp=new Node(x);
            r.next=temp;
            temp.prev=r;
            return head;
            
        }

        Node f=head.next;
        // multiple nodes
        while(f!=null){
            if(r.data<=x && f.data>x){
                Node temp=new Node(x);
                r.next=temp;
                temp.prev=r;
                f.prev= temp;
                temp.next=f;
                
                
                return head;
            }
            r=r.next;
            f=f.next;
        }
        
        Node temp=new Node(x);
        r.next=temp;
        temp.prev=r;
        return head;
        // add your code here
    }
}

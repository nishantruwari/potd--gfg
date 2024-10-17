class Solution {
    // Function to append a new node with newData at the end of a linked list
    Node[] alternatingSplitList(Node head) {
        
        Node[] sub=new Node[2];
        if(head.next==null|| head==null){
            return sub;
        }
        
      sub[0]=head;
        sub[1]=head.next;
        Node temp0=sub[0];
        Node temp1=sub[1];
        
        // if(head.next.next==null){
        //     return sub;
        // }
        int count=1;
        Node temp=head;
        temp=temp.next.next;
        while(temp!=null){
            if(count%2==0){
                temp1.next=temp;
                temp1=temp1.next;
            }else{
                temp0.next=temp;
                temp0=temp0.next;
            }
            ++count;
            temp=temp.next;
        }
        temp0.next=null;
        temp1.next=null;
        return sub;
       
    }
}

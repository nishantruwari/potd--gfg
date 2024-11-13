class Intersect {
    // Function to find intersection point in Y shaped Linked Lists.
    int intersectPoint(Node head1, Node head2) {
        
        Node temp1=head1;
        Node temp2=head2;
        
        if(temp1==temp2){
            return temp1.data;
        }
        int count1=0;
        int count2=0;
        while(temp1!=null){
            ++count1;
            temp1=temp1.next;
        }
        while(temp2!=null){
            ++count2;
            temp2=temp2.next;
        }
          temp1=head1;
         temp2=head2;
        
        if(count1>=count2){
            int n=count1-count2;
            
            while(n-->0){
                temp1=temp1.next;
            }
            
            while(temp1!=null&& temp2!=null){
                if(temp1==temp2){
                    return temp1.data;
                }
                temp1=temp1.next;
                temp2=temp2.next;
            }
        }else{
                int n=count2-count1;
            
            while(n-->0){
                temp2=temp2.next;
            }
            
            while(temp2!=null&& temp2!=null){
                if(temp1==temp2){
                    return temp1.data;
                }
                temp1=temp1.next;
                temp2=temp2.next;
                
            }
        }
        
        return -1;
        // code here
    }
}

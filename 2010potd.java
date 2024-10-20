class Solution {
    public DLLNode sortAKSortedDLL(DLLNode head, int k) {
        // Code here
        
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        
        DLLNode temp=head;
        DLLNode temp1=head;
        while(temp!=null){
            pq.add(temp.data);
            
            if(pq.size()==k+1){
               // System.out.println(pq.peek());
                temp1.data=pq.poll();
                
               
                //pq.add(temp.data);
                temp1=temp1.next;
                
            }
            temp=temp.next;
            
        }
        
        while(!pq.isEmpty()){
             temp1.data=pq.poll();
               // pq.add(temp.data);
                temp1=temp1.next;
            
            
        }
        
        return head;
        
        
        
        
    }
}

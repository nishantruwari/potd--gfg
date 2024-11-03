class Solution {
    public boolean isLengthEven(Node head) {
        
        int count=0;
        Node temp=head;
        while(temp!=null){
            ++count;
            temp=temp.next;
        }
        
        return count%2==0;
        // code here
    }
}

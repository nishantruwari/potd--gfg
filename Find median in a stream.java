class Solution {
    public ArrayList<Double> getMedian(int[] arr) {
        ArrayList<Double> ans=new ArrayList<>();
        PriorityQueue<Integer> left=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> right=new PriorityQueue<>();
        
        for(int i: arr){
            //int num=left.peek();
            if(left.isEmpty() || i<=left.peek()){
                left.add(i);
            }else{
                right.add(i);
            }
            
            //balance heaps
            if(left.size()>right.size()+1){
                right.add(left.poll());
            }else if(right.size()>left.size()){
                left.add(right.poll());
            }
            
            if(left.size()==right.size()){
                ans.add((left.peek()+right.peek())/2.0);
            }else{
                ans.add((double)left.peek());
            }
            
        }
        
        return ans;
        // code here
    }
}

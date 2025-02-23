class Solution {
    // Function to find the next greater element for each element of the array.
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        
        Stack<Integer> stack=new Stack<>();
        int n=arr.length;
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(-1);
        stack.push(arr[n-1]);
        
        for(int i=n-2;i>=0;i--){
            while(!stack.isEmpty() && arr[i]>=stack.peek()){
                stack.pop();
            }
            
            if(stack.isEmpty()){
                ans.add(-1);
                
            }else{
                ans.add(stack.peek());
                
            }
            
            stack.push(arr[i]);
            
            
            
        }
        Collections.reverse(ans);
        
        return ans;
        // code here
    }
}

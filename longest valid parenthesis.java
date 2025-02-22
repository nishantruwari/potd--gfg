class Solution {
    static int maxLength(String s) {
        
        int maxi=0;
        int n=s.length();
        
        Stack<Integer> stack=new Stack<>();
        stack.push(-1);
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('){
                stack.push(i);
            }else{
                stack.pop();
                if(!stack.isEmpty()){
                    maxi=Math.max(maxi,i-stack.peek());
                }else{
                    stack.push(i);
                }
            }
            
        }
        
        return maxi;
        // code here
    }
}

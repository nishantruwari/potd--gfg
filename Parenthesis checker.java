class Solution {
    static boolean isBalanced(String s) {
        
        Stack<Character> stack=new Stack<>();
        
        int n=s.length();
        
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            
            if(ch=='{' || ch=='('|| ch=='['){
                stack.push(ch);
                continue;
            }
            
            if(ch=='}'){
                if(!stack.isEmpty() &&stack.peek()=='{'){
                    stack.pop();
                }else{
                    return false;
                }
                
            }else if(ch==')'){
                if(!stack.isEmpty() &&stack.peek()=='('){
                    stack.pop();
                }else{
                    return false;
                }
                
            }else{
                if(!stack.isEmpty() &&stack.peek()=='['){
                    stack.pop();
                }else{
                    return false;
                }
                
            }
                
            }
            return stack.isEmpty();
            
        }
        
        
            
        
        // code here
}

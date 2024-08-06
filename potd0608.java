class Solution {

    public boolean isValid(String str) {
        
        int count=0;
        int ans=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='.'){
                int a=str.charAt(i)-'0';
                ans=ans*10+a;
             //   System.out.println(a);
                
            }else{
                ans=0;
                ++count;
            }
            
            if(ans>255) return false;
            
            
        }
        // if(count==3)
        return true;
        // else return false;
        // Write your code here
    }
}
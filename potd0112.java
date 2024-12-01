class Solution {
    // Function to find the first non-repeating character in a string.
    static char nonRepeatingChar(String s) {
        // Your code here
        Set<Character> set=new HashSet<>();
        int n=s.length();
        
        if(n==1){
            return s.charAt(0);
        }
        for(int i=0;i<n-1;i++){
            if(set.contains(s.charAt(i))){
                continue;
            }else{
                int flag=0;
                for(int j=i+1;j<n;j++){
                    if(s.charAt(j)==s.charAt(i)){
                        set.add(s.charAt(i));
                        flag=1;
                        break;
                    }
                    
                }
                if(flag==0){
                    return s.charAt(i);
                }
            }
            
        }
        
        return '$';
    }
}

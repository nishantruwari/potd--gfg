class Solution {
    public int longestUniqueSubstr(String s) {
      //  import java.util.*;
        // code here
        int maxcount=0;
        int count=0;
        
        int n=s.length();
        
        int start=0;
        HashSet<Character> set=new HashSet<>();
        
        for(int i=0;i<n;i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                ++count;
            }else{
                maxcount=Math.max(maxcount,count);
                while(s.charAt(start)!=s.charAt(i)){
                    
                    
                    count--;
                    set.remove(s.charAt(start));
                    
                    ++start;
                }
                ++start;
            }
            
        }
        maxcount=Math.max(maxcount,count);
        
        return maxcount;
    }
}

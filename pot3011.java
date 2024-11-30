class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String s1, String s2) {
        
        int m=s1.length();
        int n=s2.length();
        
        if(m!=n) return false;
        int[] count=new int[26];
        
        for(int i=0;i<m;i++){
            ++count[s1.charAt(i)-'a'];
        }
        
        for(int i=0;i<m;i++){
            if(count[s2.charAt(i)-'a']==0){
                return false;
            }else{
                --count[s2.charAt(i)-'a'];
            }
        }
        return true;

        // Your code here
    }
}

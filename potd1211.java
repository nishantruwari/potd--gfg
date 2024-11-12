//time- 3:37 mins

class Solution {
    static boolean canAttend(int[][] arr) {
        // Your code here
        
        Arrays.sort(arr,(x,y)->Integer.compare(x[0],y[0]));
        int  n =arr.length;
        if(n==1) return true;
        
        for(int i=1;i<arr.length;i++){
            if(arr[i][0]<arr[i-1][1]){
                return false;
                
            }
            
        }
        return true;
    }
}

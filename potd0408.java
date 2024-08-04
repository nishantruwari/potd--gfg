class Solution {
    
    public int maxMeetings(int n, int start[], int end[]) {
        
        
        int[][] temp=new int[n][2];
        for(int i=0;i<n;i++){
           
                temp[i][0]=start[i];
                 temp[i][1]=end[i];
                
            
        }
        
        Arrays.sort(temp,(a,b)->a[1]-b[1]);
        
        
        int max=1;
        int endi=temp[0][1];
        for(int i=1;i<n;i++){
            if(temp[i][0]>endi){
                ++max;
                endi=temp[i][1];
            }
            
        }
        return max;
    }
}
lass Solution {
    // Function to find if there is a celebrity in the party or not.
    public int celebrity(int mat[][]) {
        int n=mat.length;
        
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(mat[j][i]==1&&i!=j){
                    ++count;
                }
            }
            if(count==n-1){
                int flag=0;
                for(int k=0;k<n;k++){
                    if(mat[i][k]!=0){
                        flag++;
                        break;
                        
                    }
                }
                if(flag==0)
                return i;
                
            }
        }
        return -1;
    }
    
}
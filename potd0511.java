class GFG {
    static void rotate(int mat[][]) {
        
        int n=mat.length;
        int m=mat[0].length;
        
        // transpose
        for(int i=0;i<n;i++){
            for(int j=i;j<m;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        
        //reverse each row
        for(int i=0;i<n;i++){
            int l=0;
            int u=m-1;
            while(l<=u){
                int temp=mat[i][l];
                mat[i][l]=mat[i][u];
                mat[i][u]=temp;
                l++;
                u--;
            }
        }
        
        
        
    }
}

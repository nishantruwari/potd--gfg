class Solution {
    public ArrayList<String> findPath(int[][] mat) {
        ArrayList<String> ans=new ArrayList<>();
        helper(mat,mat.length,0,0,ans,"");
        return ans;
        // Your code here
    }
    public void helper(int[][] mat,int n, int i,int j,ArrayList<String> ans,String temp){
        //out of bound
        if(i<0||j<0||i==n||j==n||mat[i][j]==0) return;
        if(i==n-1&&j==n-1){
            ans.add(temp);
        }
        
        mat[i][j]=0;
        
        helper(mat,mat.length,i+1,j,ans,temp+"D");
        helper(mat,mat.length,i-1,j,ans,temp+"U");
        helper(mat,mat.length,i,j-1,ans,temp+"L");
        helper(mat,mat.length,i,j+1,ans,temp+"R");
        mat[i][j]=1;
    }
}
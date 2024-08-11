class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        int[][] job=new int[n][2];
        int max=0;
        for(int i =0;i<n;i++){
            job[i][0]=arr[i].deadline;
            job[i][1]=arr[i].profit;
            max=max>arr[i].deadline?max:arr[i].deadline;
            
        }
        Arrays.sort(job,(a,b)->b[1]-a[1]);
        int[] mark=new int[max+1];
        int ans=job[0][1];
        int count=1;
        mark[job[0][0]-1]=-1;
        for(int i=1;i<n;i++){
            int tar=job[i][0];
            for(int j=tar-1;j>=0;--j){
                if(mark[j]!=-1){
                    mark[j]=-1;
                    ans+=job[i][1];
                    ++count;
                    break;
                }
            }
            
            
        }
        int[] res={count,ans};
        return res;
    }
}
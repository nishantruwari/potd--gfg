class Solution {
    // Function to return the minimum cost of connecting the ropes.
    public long minCost(long[] arr) {
        
        long sum=0;
        long ans=0;
        if(arr.length==1) return 0;
        PriorityQueue<Long> pq= new PriorityQueue<>();
        
        for(long i:arr)
        pq.add(i);
        
        while(pq.size()>=2){
            long a=pq.poll();
            long b=pq.poll();
            
            sum=a+b;
            ans+=sum;
           // System.out.println("a = "+a+" b = "+b+" sum = "+sum+ " ans = "+ans);
            if(pq.size()!=0)
            pq.add(sum);
            
            
        }
        if(pq.size()==1){
           // System.out.println("entered")
            ans+=pq.poll();
        }
        return ans;
        
        
        // code here
    }
}

class Solution {

    static int sameOccurrence(int arr[], int x, int y) {
        // write code here
        
        int countX=0;
        int countY=0;
        int n=arr.length;
        int total=0;
        int diff=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        
        for(int i=0;i<n;i++){
            
            if(arr[i]==x){
                diff++;
            }
            
            if(arr[i]==y){
                diff--;
            }
            
            if(map.containsKey(diff)){
                total+=map.get(diff);
            }
            
            map.put(diff,map.getOrDefault(diff,0)+1);
          
                
            
        }
        
        return total;
    }
}




class Solution {
    ArrayList<Integer> removeDuplicate(int arr[]) {
        ArrayList<Integer> list=new ArrayList<>();
        
        int[] check=new int[101];
        
        for(int i=0;i<arr.length;i++){
            if(check[arr[i]]!=1){
                list.add(arr[i]);
                check[arr[i]]=1;
            }
        }
        
        return list;
       
    }
}


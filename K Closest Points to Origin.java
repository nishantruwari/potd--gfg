class Solution {
    public int[][] kClosest(int[][] points, int k) {
      Arrays.sort(points,(x,y)->Integer.compare((x[0]*x[0]+x[1]*x[1]),(y[0]*y[0]+y[1]*y[1])));

        return Arrays.copyOfRange(points,0,k);
    }
}

class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        for(int i=0;i<n;i++){
            Arrays.sort(grid[i]);
        }
        int ans=0;
        for(int col=0;col<m;col++){
            int maxv=0;
            for(int row =0;row<n;row++){
                maxv=Math.max(maxv,grid[row][col]);
            }
            ans+=maxv;
        }
        return ans;
    }
}
class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[] row=new int[m];
        int[] col=new int[n];
        for(int[] idx:indices){
            row[idx[0]]++;
            col[idx[1]]++;
        }
        int oddrow=0,oddcol=0;
        for(int r:row){
            if(r%2==1) oddrow++;
        }
        for(int c:col){
            if(c%2==1) oddcol++;
        }
        return oddrow*(n-oddcol)+(m-oddrow)*oddcol;
    }
}
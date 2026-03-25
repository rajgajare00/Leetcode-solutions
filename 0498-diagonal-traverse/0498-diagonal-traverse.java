class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n=mat.length,m=mat[0].length;
        int[] result=new int[n*m];
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){

        //     }
        //     for(int j=0;j<m;j++){

        //     }
        // }
        List<Integer> res=new ArrayList<>();
        int temp=0;
        while(temp<m+n-1){
            List<Integer> temp1=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if((i+j)==temp){
                    temp1.add(mat[i][j]);
                }
            }
        }
        if(temp%2==0){
            Collections.reverse(temp1);
        }
        res.addAll(temp1);
        temp++;
        }
        for(int i=0;i<res.size();i++){
            result[i]=res.get(i);
        }
        return result;
    }
}
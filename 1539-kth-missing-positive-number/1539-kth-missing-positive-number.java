class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        int i=0;
        int num=1;
        while(true){
            if(i<n && arr[i]==num){
                i++;
            }else{
                k--;
                if(k==0) return num;
            }
            num++;
        }
        // return num;
    }
}
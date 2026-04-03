class Solution {
    public int dominantIndex(int[] nums) {
        int n=nums.length;
        if(n==0) return -1;
        int max1=nums[0];
        int maxind=0;
        int sec=Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            if(nums[i]>max1){
                sec=max1;
                max1=nums[i];
                maxind=i;
            }else if(nums[i]>sec){
                sec=nums[i];
            }
        }
        if(max1>=2*sec) return maxind;
        return -1;
    }
}
class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0;
        int zerocount=0;
        int n=nums.length;
        int maxl=0;
        for(int right=0;right<n;right++){
            if(nums[right]==0){
                zerocount++;
            }
            if(zerocount>k){
                if(nums[left]==0){
                    zerocount--;
                }
                left++;
            }
           // maxl=Math.max(maxl,right-left+1);
        }
        return n-left;
    }
}
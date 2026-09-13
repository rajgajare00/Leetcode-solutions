class Solution {
    public int findNonMinOrMax(int[] nums) {
        int n=nums.length;
        if(n<2) return -1;
        int maxl=nums[0];
        int minl=nums[0];
        for(int i=0;i<n;i++){
            maxl=Math.max(maxl,nums[i]);
            minl=Math.min(minl,nums[i]);
        }
        for(int i=0;i<n;i++){
            if(nums[i]!=maxl && nums[i]!=minl){
                return nums[i];
            }
        }
        return -1;
    }
}
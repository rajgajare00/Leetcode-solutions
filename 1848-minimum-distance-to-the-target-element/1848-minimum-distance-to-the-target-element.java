class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int n=nums.length;
        int mind=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                mind = Math.min(Math.abs(i-start),mind);
            }
        }
        return mind;
    }
}
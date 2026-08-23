class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int maxl=0;
        int count=0,j=0;
        while(j<n){
            if(nums[j]==1){
                count++;
            }else{
                maxl=Math.max(maxl,count);
                count=0;
            }
            j++;
        }
        return Math.max(count,maxl);
    }
}
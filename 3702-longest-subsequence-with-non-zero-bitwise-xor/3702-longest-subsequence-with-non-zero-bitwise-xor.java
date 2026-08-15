class Solution {
    public int longestSubsequence(int[] nums) {
        int n=nums.length;
        int xor=0;
        for(int j=0;j<n;j++){
            xor=xor^nums[j];
        }    
        if(xor!=0){
            return n;
        }
        boolean all=true;
        for(int num:  nums){
            if(num!=0){
                all=false;
                break;
            }
        }
        return all?0:n-1;
    }
}
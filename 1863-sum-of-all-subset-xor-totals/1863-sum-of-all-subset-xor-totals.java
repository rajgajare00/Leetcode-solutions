class Solution {
    int sum=0;
    public int subsetXORSum(int[] nums) {
        dfs(nums,0,0);
        return sum;
    }
    private void dfs(int[] nums,int ind,int xor){
        if(ind==nums.length){
            sum+=xor;
            return ;
        }
        dfs(nums,ind+1,xor^nums[ind]);
        dfs(nums,ind+1,xor);
    }
}
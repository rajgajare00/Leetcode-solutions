class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        List<Integer> result=new ArrayList<>();
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        int choose=0;
        for(int i=n-1;i>=0;i--){
            result.add(nums[i]);
            choose+=nums[i];
            if(choose > sum - choose){
                break;
            }
        }
        return result;
    }
}
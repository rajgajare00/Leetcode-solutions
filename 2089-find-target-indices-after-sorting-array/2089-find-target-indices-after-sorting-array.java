class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int n=nums.length;
        List<Integer> ans=new ArrayList<>();
        int small=0;
        int equal=0;
        for(int num: nums){
            if(num<target){
                small++;
            }else if(num==target){
                equal++;
            }
        }
        for(int i=1;i<=equal;i++){
            ans.add(small);
            small++;
        }
        return ans;
    }
}
class Solution {
    public boolean check(int[] nums) {
        //Arrays.sort(nums);
        int count=0;
        for(int i=0;i<nums.length;i++){
            int x=nums[(i+1)%nums.length];
            if(nums[i]>x){
                count++;
            }
            if (count > 1) return false;
        }
        return true;
    }
}
class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n=nums.length;
        Set<Integer> set=new HashSet<>();

        for(int i=0;i<n;i++){
            if(nums[i]%k==0){
                set.add(nums[i]);
            }
        }
        int multiple=k;
        while(true){
            if(!set.contains(multiple)){
                return multiple;
            }
            multiple+=k;
        }
    }
}
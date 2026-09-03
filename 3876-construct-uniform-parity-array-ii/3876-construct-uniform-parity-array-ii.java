class Solution {
    public boolean uniformArray(int[] nums1) {
        int n=nums1.length;
        if(canMake(nums1,0)) return true;
        if(canMake(nums1,1)) return true;
        return false;
    }
    public static boolean canMake(int[] nums1,int target){
        int min=Integer.MAX_VALUE;
        for(int num:nums1){
            if(num%2==target){
                min=Math.min(min,num);
            } 
        }
        if(min== Integer.MAX_VALUE) return false;
        for(int num:nums1){
            if(num%2!=target){
                if((num-min)<1 || (num-min)%2!=target) return false;
            }
        }
        return true;
    }
}
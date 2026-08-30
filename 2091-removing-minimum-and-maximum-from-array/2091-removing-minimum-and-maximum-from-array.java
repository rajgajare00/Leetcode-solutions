class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int maxi=0;
        int mini=0;
        int x=1,y=1;// max index,min index
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[mini]) mini = i;
            if (nums[i] > nums[maxi]) maxi = i;
        }
        if (mini > maxi) {
            int temp = mini;
            mini = maxi;
            maxi = temp;
        }
        
        int leftOnly = maxi + 1;         
        int rightOnly = n - mini;         
        int bothSides = (mini + 1) + (n - maxi);
        leftOnly=Math.min(leftOnly,rightOnly);
        return Math.min(leftOnly,bothSides);
    }
}
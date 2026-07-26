class Solution {
    public int maximumProduct(int[] nums) {
        // int m=nums.length;
        // if(m==3) return nums[0]*nums[1]*nums[2];
        // // TreeSet<Integer> set=new TreeSet<>();
        // // for (int num : nums) {
        // //     set.add(num);
        // // }
        // // List<Integer> sorted = new ArrayList<>(set);
        // // int n = sorted.size();
        // // int productLargest = sorted.get(n-1) * sorted.get(n-2) * sorted.get(n-3);
        // // int productWithNegatives = sorted.get(0) * sorted.get(1) * sorted.get(n-1);
        // // return Math.max(productLargest, productWithNegatives);
        // Arrays.sort(nums);
        // // m+=3;
        // // for(int i=m-1;i>=3;i--){
        // //     int x=nums[i]
        // // }
        // int x=nums[m-1]*nums[m-2]*nums[m-3];
        // return x;
        Arrays.sort(nums);
        int n = nums.length;
        int productLargest = nums[n-1] * nums[n-2] * nums[n-3];
        int productWithNegatives = nums[0] * nums[1] * nums[n-1];

        return Math.max(productLargest, productWithNegatives);

    }
}
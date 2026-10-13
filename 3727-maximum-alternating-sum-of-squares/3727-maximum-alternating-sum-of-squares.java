class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[] sq = new long[n];
        for (int i = 0; i < n; i++) {
            sq[i] = 1L * nums[i] * nums[i];
        }
        Arrays.sort(sq);
        int minusCount = n / 2;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            if (i < minusCount) {
                sum -= sq[i];   
            } else {
                sum += sq[i];   
            }
        }
        return sum;
    }
}

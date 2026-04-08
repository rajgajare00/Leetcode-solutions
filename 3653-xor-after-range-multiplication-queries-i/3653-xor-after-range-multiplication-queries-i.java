class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        final int MOD = 1_000_000_007;
        for (int[] query:queries){
            int li=query[0];
            int ri=query[1];
            int ki = query[2];
            int vi = query[3];
            int idx = li;
            while (idx <= ri) {
                nums[idx] = (int)((long)nums[idx] * vi % MOD);
                idx += ki;
            }
        }
        int xorResult = 0;
        for (int num : nums) {
            xorResult ^= num;
        }
        return xorResult;
    }
}
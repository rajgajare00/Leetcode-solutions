class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int n = nums.length;
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Math.abs(i - j) <= k && nums[j] == key) {
                    result.add(i);
                    break;
                }
            }
        }
        
        return result;
    }
}
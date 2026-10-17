class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            int x = nums[i];
            while (x > 0) {
                int temp = x % 10;
                sum += temp;
                x /= 10;
            }
            ans[i] = sum;
        }
        Integer[] idx = new Integer[n];
        for (int i = 0; i < n; i++) idx[i] = i;
        Arrays.sort(idx, (a, b) -> ans[a] != ans[b] ? ans[a] - ans[b] : nums[a] - nums[b]);
        boolean[] visited = new boolean[n];
        int swaps = 0;
        for (int i = 0; i < n; i++) {
            if (visited[i] || idx[i] == i) continue;
            int j = i, len = 0;
            while (!visited[j]) {
                visited[j] = true;
                j = idx[j];
                len++;
            }
            swaps += len - 1;
        }
        return swaps;
    }
}
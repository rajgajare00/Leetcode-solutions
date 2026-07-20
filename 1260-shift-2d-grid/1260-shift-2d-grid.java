class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n = grid.length;       // number of rows
        int m = grid[0].length;    // number of columns
        int total = n * m;         // total elements

        // Flatten the grid into a 1D list
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr.add(grid[i][j]);
            }
        }

        // Effective shifts
        k = k % total;

        // Create shifted result
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                // Find new index after shifting
                int idx = ( (i * m + j) - k + total ) % total;
                row.add(arr.get(idx));
            }
            result.add(row);
        }

        return result;
    }
}

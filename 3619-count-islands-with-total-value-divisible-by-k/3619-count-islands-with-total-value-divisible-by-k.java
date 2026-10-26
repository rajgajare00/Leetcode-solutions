class Solution {
    int[][] dirs = {{1,0}, {-1,0}, {0,1}, {0,-1}};

    public int countIslands(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;

        boolean[][] vis = new boolean[m][n];
        int ans = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (grid[i][j] > 0 && !vis[i][j]) {
                    long sum = dfs(i, j, grid, vis);

                    if (sum % k == 0) {
                        ans++;
                    }
                }
            }
        }

        return ans;
    }

    private long dfs(int r, int c, int[][] grid, boolean[][] vis) {
        int m = grid.length;
        int n = grid[0].length;

        vis[r][c] = true;
        long sum = grid[r][c];

        for (int[] d : dirs) {
            int nr = r + d[0];
            int nc = c + d[1];

            if (nr >= 0 && nr < m &&
                nc >= 0 && nc < n &&
                grid[nr][nc] > 0 &&
                !vis[nr][nc]) {

                sum += dfs(nr, nc, grid, vis);
            }
        }

        return sum;
    }
}
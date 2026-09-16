class Solution {
    public int numberOfSets(int n, int k) {
        int MOD=1_000_000_007;
        long[][] dp =new long[n+1][k+1];
        long[][] prefix=new long[n+1][k+1];
        for(int i=0;i<=n;i++){
            dp[i][0]=1;
            prefix[i][0]=i;
        }
        for(int j=1;j<=k;j++){
            for (int i = 1; i <= n; i++) {
                dp[i][j] = (dp[i - 1][j] + prefix[i - 1][j - 1]) % MOD;
                prefix[i][j] = (prefix[i - 1][j] + dp[i][j]) % MOD;
            }
        }
        return (int) dp[n][k];
    }
}
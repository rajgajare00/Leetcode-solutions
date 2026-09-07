class Solution {
    public int distinctSubseqII(String s) {
        final int MOD=1_000_000_007;
        long[] end=new long[26];
        long total=0;
        for(char ch:s.toCharArray()){
            int idx=ch-'a';
            long new1=(total+1)%MOD;
            total=(total-end[idx]+new1+MOD) % MOD;
            end[idx]=new1;
        }
        return (int) (total%MOD);
    }
}
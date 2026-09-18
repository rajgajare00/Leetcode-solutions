class Solution {
    public int scoreOfString(String s) {
        int[] result = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            result[i] = (int) s.charAt(i);
        }
        int sum=0;
        int n=s.length();
        for(int i=1;i<n;i++ ){
            sum+=Math.abs(result[i]-result[i-1]);
        }
        return sum;
    }
}
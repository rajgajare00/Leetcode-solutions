class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n = s.length();
        int minLen = Integer.MAX_VALUE;
        int oneCount = 0;
        int left = 0;
        String ans = "";

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                oneCount++;
            }

            while (oneCount > k) {
                if (s.charAt(left) == '1') {
                    oneCount--;
                }
                left++;
            }

            if (oneCount == k) {
                while (s.charAt(left) == '0') {
                    left++;
                }

                int len = i - left + 1;
                String candidate = s.substring(left, i + 1);

                if (len < minLen) {
                    minLen = len;
                    ans = candidate;
                } else if (len == minLen && candidate.compareTo(ans) < 0) {
                    ans = candidate;
                }
            }
        }

        return ans;
    }
}
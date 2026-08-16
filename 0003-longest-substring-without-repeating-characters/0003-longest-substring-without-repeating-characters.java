class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        Set<Character> freq=new HashSet<>();
        int left=0;
        int maxlen=0;
        for(int i=0;i<n;i++){
            char ch =s.charAt(i);
            while(freq.contains(ch)){
                freq.remove(s.charAt(left));
                left++;
            }
            freq.add(ch);
            maxlen=Math.max(maxlen,i-left+1);
        }
        return maxlen;
    }
}
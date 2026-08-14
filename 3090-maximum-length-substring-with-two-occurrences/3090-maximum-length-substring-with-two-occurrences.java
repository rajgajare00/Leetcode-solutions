class Solution {
    public int maximumLengthSubstring(String s) {
        int n=s.length();
        int left=0,maxl=0;
        int[] freq=new int[26];
        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'a']++;
            while(freq[s.charAt(i)-'a']>2){
                freq[s.charAt(left)-'a']--;
                left++;
            }
            maxl=Math.max(maxl,i-left + 1);
        }
        return maxl;
    }
}
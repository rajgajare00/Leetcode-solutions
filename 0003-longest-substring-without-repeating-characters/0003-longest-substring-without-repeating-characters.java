class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        Map<Character,Integer> last=new HashMap<>();
        int left=0;
        int maxlen=0;
        for(int i=0;i<n;i++){
            char ch =s.charAt(i);
            if(last.containsKey(ch) && last.get(ch)>=left){
                left=last.get(ch)+1;
            }
            last.put(ch,i);
            maxlen=Math.max(maxlen,i-left+1);
        }
        return maxlen;
    }
}
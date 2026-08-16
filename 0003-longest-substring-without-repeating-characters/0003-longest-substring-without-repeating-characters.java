class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        // Map<Character,Integer> last=new HashMap<>();
        int[] last=new int[128];
        Arrays.fill(last,-1);
        int left=0;
        int maxlen=0;
        for(int i=0;i<n;i++){
            char ch =s.charAt(i);
            if(last[ch]>=left){
                left=last[ch]+1;
            }
            // if(last.containsKey(ch) && last.get(ch)>=left){
            //     left=last.get(ch)+1;
            // }
            // last.put(ch,i);
            last[ch]=i;
            maxlen=Math.max(maxlen,i-left+1);
        }
        return maxlen;
    }
}
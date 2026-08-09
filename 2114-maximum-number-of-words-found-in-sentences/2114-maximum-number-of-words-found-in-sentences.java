class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxw=0;
        for(String s: sentences){
            int word=s.split(" ").length;
            maxw=Math.max(maxw,word);
        }
        return maxw;
    }
}
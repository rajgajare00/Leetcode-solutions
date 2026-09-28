class Solution {
    public int maxDepth(String s) {
        int curr=0;
        int maxdepth=0;
        for(char ch: s.toCharArray()){
            if(ch=='('){
                curr++;
                maxdepth=Math.max(maxdepth,curr);
            }else if(ch==')'){
                curr--;
            }
        }
        return maxdepth;
    }
}
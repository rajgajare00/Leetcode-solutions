class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int left=0,right=0,underscore=0;
        for(int i=0;i<moves.length();i++){
            char c = moves.charAt(i);
            if (c == 'L') left++;
            else if (c == 'R') right++;
            else if (c == '_') underscore++;
        }
        return Math.abs(left-right)+underscore;
    }
}
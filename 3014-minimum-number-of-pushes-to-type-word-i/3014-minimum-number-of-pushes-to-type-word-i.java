class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int pushes = 0;
        pushes += Math.min(n, 8) * 1;
        if (n > 8) pushes += Math.min(n - 8, 8) * 2;
        if (n > 16) pushes += Math.min(n - 16, 8) * 3;
        if (n > 24) pushes += (n - 24) * 4;
        
        return pushes;
    }
}
class Solution {
    public int maxScore(String s) {
        int totalOnes = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') totalOnes++;
        }
        int maxScore = 0;
        int zerosLeft = 0, onesLeft = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') zerosLeft++;
            else onesLeft++;

            int score = zerosLeft + (totalOnes - onesLeft);
            maxScore = Math.max(maxScore, score);
        }
        return maxScore;
    }
}
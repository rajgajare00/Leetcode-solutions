class Solution {
    public boolean checkDistances(String s, int[] distance) {
        int[] firstIndex = new int[26];
        Arrays.fill(firstIndex, -1); 

        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            if (firstIndex[idx] == -1) {
                firstIndex[idx] = i; 
            } else {
                int gap = i - firstIndex[idx] - 1; 
                if (gap != distance[idx]) return false;
            }
        }
        return true;
    }
}
class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }
        Arrays.sort(freq);
        int total = 0;
        int idx = 0; 
        for (int i = 25; i >= 0 && freq[i] > 0; i--, idx++) {
            int cost = (idx / 8) + 1;
            total += cost * freq[i];
        }
        
        return total;
    }
}
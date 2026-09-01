class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int count = s1.length();
        int left = 0;
        int n = s1.length();

        for (int r = 0; r < s2.length(); r++) {
            char ch = s2.charAt(r);
            int val = map.getOrDefault(ch, 0);

            if (val > 0) count--;
            map.put(ch, val - 1);

            if (count == 0) return true;

            if (r - left + 1 == n) {
                char leftch = s2.charAt(left);
                int leftval = map.getOrDefault(leftch, 0);
                if (leftval >= 0) count++;
                map.put(leftch, leftval + 1);
                left++;
            }
        }
        return false;
    }
}

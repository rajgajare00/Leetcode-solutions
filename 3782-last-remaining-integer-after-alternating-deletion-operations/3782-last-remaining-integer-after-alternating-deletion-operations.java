class Solution {
    public long lastInteger(long n) {
        long a = 1, d = 1, m = n;
        boolean leftTurn = true;
        
        while (m > 1) {
            if (leftTurn) {
                m = (m + 1) / 2;
                d *= 2;
            } else {
                long last = a + (m - 1) * d;
                long newM = (m + 1) / 2;
                d *= 2;
                a = last - (newM - 1) * d;
                m = newM;
            }
            leftTurn = !leftTurn;
        }
        
        return a;
    }
}
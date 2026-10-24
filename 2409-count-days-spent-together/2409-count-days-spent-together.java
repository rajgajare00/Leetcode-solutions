class Solution {

    int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};

    private int getDayOfYear(String date) {
        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3));

        int total = day;

        for (int i = 0; i < month - 1; i++) {
            total += daysInMonth[i];
        }

        return total;
    }

    public int countDaysTogether(String arriveAlice, String leaveAlice,
                                 String arriveBob, String leaveBob) {

        int start = Math.max(
                getDayOfYear(arriveAlice),
                getDayOfYear(arriveBob));

        int end = Math.min(
                getDayOfYear(leaveAlice),
                getDayOfYear(leaveBob));

        return Math.max(0, end - start + 1);
    }
}
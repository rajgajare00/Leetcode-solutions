class Solution {
    public String reformatNumber(String number) {
        StringBuilder digits = new StringBuilder();
        for (char ch : number.toCharArray()) {
            if (Character.isDigit(ch)) {
                digits.append(ch);
            }
        }

        StringBuilder ans = new StringBuilder();
        int n = digits.length();
        int i = 0;

        while (n - i > 4) {
            ans.append(digits.substring(i, i + 3)).append("-");
            i += 3;
        }

        int remaining = n - i;

        if (remaining == 4) {
            ans.append(digits.substring(i, i + 2))
               .append("-")
               .append(digits.substring(i + 2, i + 4));
        } else {
            ans.append(digits.substring(i));
        }

        return ans.toString();
    }
}
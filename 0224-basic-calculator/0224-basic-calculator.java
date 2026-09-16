class Solution {
    public int calculate(String s) {
        int result = 0;
        int sign = 1; // +1 or -1
        int num = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0'); // build multi-digit number
            } else if (c == '+') {
                result += sign * num;
                num = 0;
                sign = 1;
            } else if (c == '-') {
                result += sign * num;
                num = 0;
                sign = -1;
            } else if (c == '(') {
                // push current result and sign
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            } else if (c == ')') {
                result += sign * num;
                num = 0;
                result *= stack.pop(); // sign before '('
                result += stack.pop(); // result before '('
            }
        }

        if (num != 0) {
            result += sign * num; // add last number
        }

        return result;
    }
}

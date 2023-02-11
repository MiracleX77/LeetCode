import java.util.Stack;

class Solution150 {
    public static int evalRPN(String[] tokens) {
        int result, num2, num1;
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+")) {
                num2 = stack.pop();
                num1 = stack.pop();
                result = num1 + num2;
            } else if (tokens[i].equals("-")) {
                num2 = stack.pop();
                num1 = stack.pop();
                result = num1 - num2;
            } else if (tokens[i].equals("*")) {
                num2 = stack.pop();
                num1 = stack.pop();
                result = num1 * num2;
            } else if (tokens[i].equals("/")) {
                num2 = stack.pop();
                num1 = stack.pop();
                result = num1 / num2;
            } else {
                result = Integer.valueOf(tokens[i]);
            }
            stack.push(result);
        }
        return stack.peek();
    }

    public static void main(String[] args) {
        String[] str = { "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+" };
        System.out.println(evalRPN(str));
    }
}
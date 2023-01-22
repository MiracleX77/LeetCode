class Solution1678 {
    public static String interpret(String command) {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') {
                result.append('G');
            } else if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                result.append('o');
                i++;
            } else {
                result.append("al");
                i += 3;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(interpret("G()(al)"));
    }
}
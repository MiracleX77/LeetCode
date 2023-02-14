class Solution67 {
    public String addBinary(String a, String b) {
        int len_a = a.length() - 1;
        int len_b = b.length() - 1;
        int b1, carry = 0, a1;
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < Math.max(a.length(), b.length()); i++) {
            if (len_b >= 0) {
                b1 = b.charAt(len_b) - '0';
            } else {
                b1 = 0;
            }
            if (len_a >= 0) {
                a1 = a.charAt(len_a) - '0';
            } else {
                a1 = 0;
            }
            int sum = a1 + b1 + carry;
            if (sum >= 2) {
                carry = 1;
            } else {
                carry = 0;
            }
            res.append(sum % 2);
            len_a--;
            len_b--;
        }
        if (carry == 1) {
            res.append("1");
        }
        return res.reverse().toString();
    }
}
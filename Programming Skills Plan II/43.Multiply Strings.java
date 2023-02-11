import java.math.BigInteger;

class Solution43 {
    public static String multiply(String num1, String num2) {
        BigInteger n1 = new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);
        BigInteger res = n1.multiply(n2);
        return res + "";
    }

    public static void main(String[] args) {
        System.out.println(multiply("123456789", "987654321"));
    }
}
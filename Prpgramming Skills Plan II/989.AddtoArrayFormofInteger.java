import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

class Solution989 {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        // List<Integer> res = new ArrayList<Integer>();
        // for (int i = num.length - 1; i >= 0; i--) {
        // res.add(0, (num[i] + k) % 10);
        // k = (num[i] + k) / 10;
        // }
        // System.out.println(k);

        // while (k != 0) {
        // res.add(0, k % 10);
        // k /= 10;
        // }
        // return res;
        List<Integer> res = new ArrayList<Integer>();
        String s = "";
        for (int i : num) {
            s += i;
        }
        String k1 = k + "";
        BigInteger st1 = new BigInteger(s);
        BigInteger st2 = new BigInteger(k1);
        BigInteger res_str = st1.add(st2);
        for (char ch : res_str.toString().toCharArray()) {
            res.add(ch - '0');
        }
        return res;
    }

    public static void main(String[] args) {
        int[] n = { 2, 1, 5 };
        System.out.println(addToArrayForm(n, 806));
    }
}
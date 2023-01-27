class Solution389 {
    public static char findTheDifference(String s, String t) {
        int sum_hashcode1 = 0, sum_hashcode2 = 0;
        byte[] byte_s = s.getBytes();
        byte[] byte_t = t.getBytes();

        for (int i = 0; i < byte_s.length; i++) {
            sum_hashcode1 += byte_s[i];
            sum_hashcode2 += byte_t[i];
        }
        sum_hashcode2 += byte_t[byte_t.length - 1];
        return (char) (sum_hashcode2 - sum_hashcode1);
    }

    public static void main(String[] args) {
        System.out.println(findTheDifference("aa", "aba"));
    }
}
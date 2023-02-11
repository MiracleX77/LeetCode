class Solution1071 {
    public static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1))
            return "";
        int len_str1 = str1.length();
        int len_str2 = str2.length();
        int min_len = Math.min(len_str1, len_str2);
        for (int i = min_len; i > 1; i--) {
            if (len_str1 % i == 0 && len_str2 % i == 0) {
                return str2.substring(0, i);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(gcdOfStrings("LEET", "CODE"));
    }
}
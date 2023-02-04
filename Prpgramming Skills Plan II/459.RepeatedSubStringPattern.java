class Solution459 {
    public static boolean repeatedSubstringPattern(String s) {
        int length = s.length();
        for (int i = length / 2; i > 0; i--) {
            if (length % i == 0) {
                int count = length / i;
                String word = s.substring(0, i);
                System.out.println(word);
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < count; j++) {
                    sb.append(word);
                }
                System.out.println(sb.toString());
                if (sb.toString().equals(s))
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("abcabcabcabc"));
    }
}
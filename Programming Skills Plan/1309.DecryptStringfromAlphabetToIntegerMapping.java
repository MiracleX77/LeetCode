class Solution1309 {
    public static String freqAlphabets(String s) {
        StringBuilder string = new StringBuilder();
        char ch;
        int n;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 2) {
                if (s.charAt(i + 2) == '#') {
                    n = 96 + ((int) (s.charAt(i) - '0') * 10) + (int) (s.charAt(i + 1) - '0');
                    ch = (char) n;
                    string.append(ch);
                    i += 2;
                } else {
                    n = 96 + (int) (s.charAt(i) - '0');
                    ch = (char) n;
                    string.append(ch);
                }
            } else {
                n = 96 + (int) (s.charAt(i) - '0');
                ch = (char) n;
                string.append(ch);
            }
        }
        return string.toString();
    }

    public static void main(String[] args) {
        System.out.println(freqAlphabets("10#11#12"));
    }
}
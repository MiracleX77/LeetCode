class Solution28 {
    public static int strStr(String haystack, String needle) {
        int index_needle = -1;
        char chr = needle.charAt(0);
        if (needle.equals(haystack)) {
            return 0;
        }
        if (needle.length() > haystack.length()) {
            return -1;
        }
        for (int i = 0; i < haystack.length(); i++) {
            index_needle = -1;
            if (haystack.charAt(i) == chr) {
                index_needle++;
                if (index_needle == needle.length() - 1) {
                    return i;
                }
                for (int y = i + 1; y < haystack.length(); y++) {
                    if (index_needle == needle.length() - 1) {
                        return i;
                    } else {
                        if (needle.charAt(index_needle + 1) != haystack.charAt(y)) {
                            break;
                        } else {
                            index_needle++;
                            if (index_needle == needle.length() - 1) {
                                return i;
                            }
                        }

                    }
                }
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        System.out.println(strStr("mississippi", "issipi"));
    }
}
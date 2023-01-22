class Solution1768 {
    public static String mergeAlternately(String word1, String word2) {
        int min_length, word1_len, word2_len;
        StringBuffer merged = new StringBuffer();
        word1_len = word1.length();
        word2_len = word2.length();
        min_length = Math.min(word1_len, word2_len);
        for (int i = 0; i < min_length; i++) {
            merged.append(word1.charAt(i));
            merged.append(word2.charAt(i));
        }
        if (word1_len > min_length) {
            merged.append(word1.substring(min_length));
        }
        if (word2_len > min_length) {
            merged.append(word2.substring(min_length));
        }
        return merged.toString();
    }

    public static void main(String[] args) {
        System.out.println(mergeAlternately("ab", "pqrs"));
    }
}
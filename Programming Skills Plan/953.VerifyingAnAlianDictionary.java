
class Solution953 {
    public static boolean isAlienSorted(String[] words, String order) {
        int index_word1, index_word2;
        for (int i = 1; i < words.length; i++) {
            index_word2 = order.indexOf(words[i].charAt(0));
            index_word1 = order.indexOf(words[i - 1].charAt(0));
            if (index_word2 < index_word1) {
                return false;
            } else if ((index_word2 == index_word1)) {
                for (int j = 1; j < words[i - 1].length(); j++) {
                    if (j > words[i].length() - 1) {
                        return false;
                    }
                    index_word2 = order.indexOf(words[i].charAt(j));
                    index_word1 = order.indexOf(words[i - 1].charAt(j));
                    if (index_word2 < index_word1) {
                        return false;
                    }
                    if (index_word1 < index_word2) {
                        break;
                    }
                }
            }
            System.out.println();
        }
        return true;
    }

    public static void main(String[] args) {
        String[] w = { "apap", "app" };
        System.out.println(isAlienSorted(w, "abcdefghijklmnopqrstuvwxyz"));
    }
}
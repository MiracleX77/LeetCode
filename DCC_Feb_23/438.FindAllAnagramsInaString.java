import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution438 {
    public static List<Integer> findAnagrams(String s, String p) {
        int len_p = p.length(), index_start = 0;
        List<Integer> index_res = new ArrayList<Integer>();
        HashMap<Character, Integer> s_count = new HashMap<>();
        HashMap<Character, Integer> p_count = new HashMap<>();
        if (len_p > s.length()) {
            return index_res;
        }
        for (int i = 0; i < len_p; i++) {
            if (s_count.containsKey(s.charAt(i))) {
                s_count.put(s.charAt(i), s_count.get(s.charAt(i)) + 1);
            } else {
                s_count.put(s.charAt(i), 1);
            }
            if (p_count.containsKey(p.charAt(i))) {
                p_count.put(p.charAt(i), p_count.get(p.charAt(i)) + 1);
            } else {
                p_count.put(p.charAt(i), 1);
            }
        }
        if (s_count.equals(p_count)) {
            index_res.add(0);
        }
        for (int j = len_p - 1; j < s.length() - 1; j++) {
            if (s_count.containsKey(s.charAt(j + 1))) {
                s_count.put(s.charAt(j + 1), s_count.get(s.charAt(j + 1)) + 1);
            } else {
                s_count.put(s.charAt(j + 1), 1);
            }
            if (s_count.containsKey(s.charAt(index_start))) {
                s_count.put(s.charAt(index_start), s_count.get(s.charAt(index_start)) - 1);
                if (s_count.get(s.charAt(index_start)) == 0) {
                    s_count.remove(s.charAt(index_start), 0);
                }
            }
            index_start++;
            if (p_count.equals(s_count)) {
                index_res.add(index_start);
            }
        }
        return index_res;
    }

    public static void main(String[] args) {
        System.out.println(findAnagrams("abcabc", "abc"));
    }
}
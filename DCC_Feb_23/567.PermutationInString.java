import java.util.HashMap;

class Solution567 {
    public static boolean checkInclusion(String s1, String s2) {
        int length_s1 = s1.length();
        HashMap<Character, Integer> count_s1 = new HashMap<>();
        StringBuilder str_res = new StringBuilder();
        if (s2.length() < length_s1) {
            return false;
        }
        str_res.append(s2.substring(0, length_s1));
        for (char s : s1.toCharArray()) {
            if (count_s1.containsKey(s)) {
                count_s1.put(s, count_s1.get(s) + 1);
            } else {
                count_s1.put(s, 1);
            }
        }
        if (s2.length() == length_s1) {
            HashMap<Character, Integer> count_res = new HashMap<>();
            for (char r : str_res.toString().toCharArray()) {
                if (count_res.containsKey(r)) {
                    count_res.put(r, count_res.get(r) + 1);
                } else {
                    count_res.put(r, 1);
                }
            }
            if (count_res.equals(count_s1))
                return true;
        }
        if (str_res.toString().equals(s1))
            return true;
        for (int i = length_s1 - 1; i < s2.length(); i++) {
            HashMap<Character, Integer> count_res = new HashMap<>();
            for (char r : str_res.toString().toCharArray()) {
                if (count_res.containsKey(r)) {
                    count_res.put(r, count_res.get(r) + 1);
                } else {
                    count_res.put(r, 1);
                }
            }
            if (i < s2.length() - 1) {
                str_res.deleteCharAt(0);
                str_res.append(s2.charAt(i + 1));
            }
            if (count_res.equals(count_s1))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkInclusion("ab", "eidboaoo"));
    }
}
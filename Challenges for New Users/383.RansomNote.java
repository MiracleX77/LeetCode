import java.util.HashMap;

class Solution383 {
    public static boolean canConstruct(String ransomNote, String magazine) {
        char[] ran = ransomNote.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int l = 0; l < magazine.length(); l++) {
            map.merge(magazine.charAt(l), 1, Integer::sum);
        }
        for (int i = 0; i < ran.length; i++) {
            if (map.get(ran[i]) == null || map.get(ran[i]) == 0) {
                return false;
            }
            map.put(ran[i], map.get(ran[i]) - 1);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("aa", "ab"));
    }
}
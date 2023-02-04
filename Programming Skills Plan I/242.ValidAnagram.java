import java.util.Arrays;

class Solution242 {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] string1 = s.toCharArray();
        char[] string2 = t.toCharArray();
        Arrays.sort(string1);
        Arrays.sort(string2);
        String s1 = new String(string1);
        String s2 = new String(string2);

        return s1.equals(s2);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("rat", "art"));
    }
}
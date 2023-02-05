class Solution58 {
    public static int lengthOfLastWord(String s) {
        String[] list_s = s.split(" ");
        return list_s[list_s.length - 1].length();
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }
}
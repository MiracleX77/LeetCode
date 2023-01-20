class Solution1790 {
    public static boolean areAlmostEqual(String s1, String s2) {
        char first = Character.MIN_VALUE;
        char second = Character.MIN_VALUE;
        int check = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                check++;
                if (check == 1) {
                    first = s1.charAt(i);
                    second = s2.charAt(i);
                } else {
                    if (first != s2.charAt(i) || second != s1.charAt(i)) {
                        return false;
                    }
                }

            }

        }
        if (check != 2 && check != 0) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print(areAlmostEqual("bank", "bank"));
    }
}
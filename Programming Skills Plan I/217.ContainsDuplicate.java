import java.util.*;

class Solution217 {
    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            int count = map.getOrDefault(i, 0);
            map.put(i, count + 1);
            if (count > 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] n = { 1, 2, 3, 5 };
        System.out.println(containsDuplicate(n));
    }
}
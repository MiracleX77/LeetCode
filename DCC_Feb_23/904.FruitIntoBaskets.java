import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class Solution904 {
    public static int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> baskets = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        int left = 0, right = 1;
        if (fruits.length == 1) {
            return 1;
        }
        baskets.put(fruits[left], 1);
        for (int i = 1; i < fruits.length; i++) {
            System.out.println(baskets);
            if (baskets.containsKey(fruits[i])) {
                baskets.put(fruits[i], baskets.get(fruits[i]) + 1);
            } else {
                if (baskets.size() != 2) {
                    right = i;
                    baskets.put(fruits[right], 1);
                } else {
                    list.add(baskets.get(fruits[left - 1]) + baskets.get(fruits[right - 1]));
                    baskets.put(fruits[right], 1);
                    baskets.remove(fruits[left - 1]);
                }
                left++;
                right++;
            }
        }
        if (baskets.size() == 1) {
            list.add(baskets.get(fruits[right]));
        } else {
            list.add(baskets.get(fruits[right]) + baskets.get(fruits[left]));
        }
        System.out.println(baskets);

        Collections.sort(list);
        return list.get(list.size() - 1);
    }

    public static void main(String[] args) {
        int[] n = { 1, 0, 1, 4, 1, 4, 1, 2, 3 };
        System.out.println(totalFruit(n));
    }
}
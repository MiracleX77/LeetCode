import java.util.*;

class Solution1337 {
    public static int[] kWeakestRows(int[][] mat, int k) {
        int[] weaker = new int[k];
        int m = 0;
        HashMap<Integer, Integer> solider = new HashMap<>();
        LinkedHashMap<Integer, Integer> solider_sort = new LinkedHashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }
            }
            solider.put(i, count);
        }

        for (Map.Entry<Integer, Integer> entry : solider.entrySet()) {
            list.add(entry.getValue());
        }
        Collections.sort(list);
        for (int num : list) {
            for (Map.Entry<Integer, Integer> entryz : solider.entrySet()) {
                if (entryz.getValue() == num) {
                    solider_sort.put(entryz.getKey(), num);
                    System.out.println(solider_sort.toString());
                }
            }
        }
        for (Map.Entry<Integer, Integer> entry : solider.entrySet()) {
            weaker[m] = entry.getKey();
            System.out.println(weaker[m]);
            m++;
            if (m == k) {
                return weaker;
            }

        }

        return weaker;

    }

    public static void main(String[] args) {
        int[][] mat = { { 1, 0 }, { 1, 0 }, { 1, 0 }, { 1, 1 } };
        System.out.println(kWeakestRows(mat, 4));
    }
}
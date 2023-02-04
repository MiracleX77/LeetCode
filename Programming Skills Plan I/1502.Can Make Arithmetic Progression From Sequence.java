import java.util.Arrays;

class Solution2 {
    public static boolean canMakeArithmeticProgression(int[] arr) {
        double n = arr.length;
        int[] arr_reverse = arr.clone();
        if (n == 1) {
            return true;
        }
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        for (int i = 0; i < arr.length; i++) {
            arr_reverse[i] = arr[arr.length - 1 - i];
            if (i > 1) {
                if (arr[i] - arr[i - 1] != diff) {
                    return false;
                }
            }
        }

        System.out.println(Arrays.toString(arr_reverse));
        diff = arr_reverse[1] - arr_reverse[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr_reverse[i] - arr_reverse[i - 1] != diff) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] data = { 1, 2, 5, 4, 5 };
        System.out.println(canMakeArithmeticProgression(data));
    }
}

class Solution1588 {

    public static int sumOddLengthSubarrays(int[] arr) {
        int res = 0, n = arr.length;
        for (int i = 0; i < n; ++i) {
            res += ((i + 1) * (n - i) + 1) / 2 * arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] n = { 1, 4, 2, 5, 3 };
        System.out.println(sumOddLengthSubarrays((n)));
    }
}
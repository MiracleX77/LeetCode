
class Solution1470 {
    public static int[] shuffle(int[] nums, int n) {
        int[] res = new int[n * 2];
        for (int i = 0; i < nums.length; i += 2) {
            res[i] = nums[i / 2];
            res[i + 1] = nums[i / 2 + n];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] n = { 1, 1, 2, 2 };
        System.out.println(shuffle(n, 2));
    }
}
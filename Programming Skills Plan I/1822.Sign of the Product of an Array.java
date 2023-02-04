class Solution1 {
    public static int arraySign(int[] nums) {
        int count_negative = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                return 0;
            } else if (nums[i] < 0) {
                count_negative += 1;
            }
            ;
        }
        if (count_negative % 2 == 1 && count_negative >= 1) {
            return -1;
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] data = { -1, -2, -3, -4, 3, 2, 1 };
        System.out.println(arraySign(data));
    }
}

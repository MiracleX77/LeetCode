
class Solution896 {
    public static boolean isMonotonic(int[] nums) {
        boolean increase = false;
        boolean decrease = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                decrease = true;
            }
            if (nums[i] < nums[i + 1]) {
                increase = true;
            }
            if (increase == true && decrease == true) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] num = { 6, 1, 3, 1 };
        System.out.println(isMonotonic(num));
    }
}
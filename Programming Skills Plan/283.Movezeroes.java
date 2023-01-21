
class Solution283 {
    public static void moveZeroes(int[] nums) {
        int pointer_index = 0, pre_num;
        int pointer_zero = 0;
        while (pointer_index != nums.length) {
            if (nums[pointer_index] != 0) {
                pre_num = nums[pointer_zero];
                nums[pointer_zero] = nums[pointer_index];
                nums[pointer_index] = pre_num;
                pointer_zero++;
            }
            pointer_index++;
        }
    }

    public static void main(String[] args) {
        int[] n = { 1, 1, 0 };
        moveZeroes(n);
    }
}
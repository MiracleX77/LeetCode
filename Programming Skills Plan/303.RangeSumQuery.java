class NumArray {
    private int[] data_nums;

    public NumArray(int[] nums) {
        this.data_nums = nums;
    }

    public int sumRange(int left, int right) {
        int sum = 0;
        for (int i = left; i < right + 1; i++) {
            sum += data_nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = { -2, 0, 3, -5, 2, -1 };
        NumArray obj = new NumArray(nums);
        System.out.println(obj.sumRange(2, 5));
    }
}
/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
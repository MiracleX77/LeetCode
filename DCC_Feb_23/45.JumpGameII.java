class Solution45 {
    public static int jump(int[] nums) {
        int len = nums.length - 1, curr = -1, next = 0, ans = 0;
        for (int i = 0; next < len; i++) {
            System.out.println(next);
            if (i > curr) {
                System.out.println(next);
                ans++;
                curr = next;
            }
            System.out.println(nums[i]);
            next = Math.max(next, nums[i] + i);
            System.out.println(next);

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] n = { 2, 3, 1 };

        System.out.println(jump(n));
    }
}

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution5 {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // int[] result = new int[nums1.length];
        // for (int i = 0; i < nums1.length; i++) {
        // for (int j = 0; j < nums2.length; j++) {

        // if (nums1[i] == nums2[j]) {
        // if (j == nums2.length - 1) {
        // result[i] = -1;
        // } else {
        // for (int k = j; k < nums2.length - 1; k++) {
        // if (nums2[k + 1] > nums2[j]) {
        // result[i] = nums2[k + 1];
        // break;
        // }
        // }
        // if (result[i] == 0) {
        // result[i] = -1;
        // }
        // }
        // }
        // }
        // }
        // for (int i : result) {
        // System.out.println(i);
        // }
        // return result;
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for (int num : nums2) {
            // System.out.println(!stack.isEmpty());
            while (!stack.isEmpty() && stack.peek() < num) {
                map.put(stack.pop(), num);
                // System.out.println(map);

            }
            stack.push(num);
            // System.out.println(stack);
        }

        for (int i = 0; i < nums1.length; i++)
            nums1[i] = map.getOrDefault(nums1[i], -1);
        return nums1;
    }

    public static void main(String[] args) {
        int[] num1 = { 1, 3, 5, 2, 4 };
        int[] num2 = { 6, 5, 4, 3, 2, 1, 7 };
        System.out.println(nextGreaterElement(num1, num2));

    }
}


class Solution66 {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] = digits[i] + 1;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] new_digits = new int[digits.length + 1];
        new_digits[0] = 1;
        return new_digits;
    }

    public static void main(String[] args) {
        int[] num = { 9 };
        System.out.println(plusOne(num));
    }
}
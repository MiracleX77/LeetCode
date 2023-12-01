public class S66 {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        int carry = 1; // ตัวค่าเก็บเลขที่ถูกยกเลข 1

        for (int i = n - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            digits[i] = sum % 10; // เก็บค่าหลักหน่วยของผลรวม
            carry = sum / 10; // เก็บค่าที่ถูกยกเลข 1
        }

        if (carry > 0) {
            int[] result = new int[n + 1];
            result[0] = carry;
            for (int i = 0; i < n; i++) {
                result[i + 1] = digits[i];
            }
            return result;
        } else {
            return digits;
        }
    }

    public static void main(String[] args) {
        int[] word1={9,8,7,6,5,4,3,2,1,0};


        System.out.println(plusOne(word1));
    }
}

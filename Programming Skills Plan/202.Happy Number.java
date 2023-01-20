
class Solution3 {
    public static boolean isHappy(int n) {
        int sum = 0;
        while (n != 1) {
            sum = 0;
            while (n != 0) {
                sum += (n % 10) * (n % 10);
                n = n / 10;
                System.out.println(n);
                System.out.println(sum);
            }
            n = sum;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }
}
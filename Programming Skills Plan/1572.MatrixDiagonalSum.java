class Solution1572 {
    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            System.out.println(mat[i][i]);
            System.out.println(mat[i][mat.length - 1 - i]);

            sum += mat[i][i];
            if (mat.length % 2 == 1 && i == mat.length / 2) {
                sum -= mat[i][mat.length - 1 - i];
            }
            sum += mat[i][mat.length - 1 - i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] n = { { 1, 2, 3, 4 }, { 4, 5, 6, 4 }, { 7, 8, 9, 4 } };
        System.out.println(diagonalSum(n));
    }
}
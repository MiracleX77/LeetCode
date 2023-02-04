class Solution566 {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat.length * mat[0].length != r * c) {
            return mat;
        }
        int[][] result_arr = new int[r][c];
        int index_row = 0, index_col = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                result_arr[index_row][index_col] = mat[i][j];
                index_col++;
                if (index_col == c) {
                    index_row++;
                    index_col = 0;
                }
                ;
            }
        }

        return result_arr;
    }

    public static void main(String[] args) {
        int[][] n = { { 1, 2 }, { 3, 4 } };
        System.out.println(matrixReshape(n, 1, 4));
    }
}
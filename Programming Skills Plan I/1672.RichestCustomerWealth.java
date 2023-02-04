class Solution1672 {
    public static int maximumWealth(int[][] accounts) {
        int max_wealth = 0, sum_wealth;
        for (int i = 0; i < accounts.length; i++) {
            sum_wealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                if (i == 0) {
                    max_wealth += accounts[i][j];
                } else {
                    sum_wealth += accounts[i][j];
                }
            }
            if (sum_wealth >= max_wealth) {
                max_wealth = sum_wealth;
            }
        }
        return max_wealth;
    }

    public static void main(String[] args) {
        int[][] n = { { 1, 5 }, { 3, 7 } };
        System.out.println(maximumWealth(n));
    }
}
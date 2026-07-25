class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length + 1][amount + 1];
        for(int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return minCoins(amount, 0, coins, dp);
    }

    private int minCoins(int amount, int index, int[] coins, int[][] dp) {
        if(amount == 0) return 1;
        if(amount < 0) return 0;
        if(index == coins.length) return 0;
        if(dp[index][amount] != -1) return dp[index][amount];

        int take = minCoins(amount - coins[index], index, coins, dp);
        int skip = minCoins(amount, index + 1, coins, dp);

        return dp[index][amount] = take + skip;
    }
}

class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[] dp = new int[amount+1];
        Arrays.fill(dp, -1);
        
        int res = minCoins(coins, dp, amount);
        return res == Integer.MAX_VALUE ? -1 : res;
    }

    private int minCoins(int[] coins, int[] dp, int remainingAmount) {
        if (remainingAmount == 0)
            return 0;
        if (remainingAmount < 0)
            return Integer.MAX_VALUE;
        if(dp[remainingAmount] != -1) return dp[remainingAmount];

        int ans = Integer.MAX_VALUE;

        for (int coin : coins) {
            int res = minCoins(coins, dp, (remainingAmount - coin));

            if(res != Integer.MAX_VALUE) {
                ans = Math.min(ans, 1 + res);
            }
        }
        dp[remainingAmount] = ans;
        return ans;
    }
}

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        Arrays.fill(dp, -1);

        int one = minCost(cost, dp, 0);
        int two = minCost(cost, dp, 1);
        
        return Math.min(one, two);
    }

    private int minCost(int[] cost, int[] dp, int i) {
        if(i >= cost.length) return 0;
        if(dp[i] != -1) return dp[i];

        int oneStep = cost[i] + minCost(cost, dp, i + 1);
        int twoStep = cost[i] + minCost(cost, dp, i + 2);

        return dp[i] = Math.min(oneStep, twoStep);
    }
}

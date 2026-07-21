class Solution {
    public int climbStairs(int n) {
        int[] arr = new int[n+1];
        Arrays.fill(arr, -1);
        return ways(n, arr);
    }
    int ways(int n, int[] dp) {
        if(n <= 1) return 1;
        if(dp[n] != -1) return dp[n];
        int ans = ways(n-1, dp) + ways(n-2, dp);
        dp[n] = ans;
        return ans;
    }
}

class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return robHouse(nums, 0, dp);
    }
    private int robHouse(int[] nums, int i, int[] dp) {
        if(i >= nums.length) return 0;
        if(dp[i] != -1) return dp[i];

        int take = nums[i] + robHouse(nums, i+2, dp);
        int skip = robHouse(nums, i+1, dp);
        int ans = Math.max(take, skip);
        dp[i] = ans;
        return ans;
    }
}

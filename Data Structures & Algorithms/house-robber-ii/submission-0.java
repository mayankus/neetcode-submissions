class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if( n == 1) return nums[0];
        if( n == 2) return Math.max(nums[0], nums[1]);
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        int option1 = robHouse(nums, dp, 0, n-2);
        
        Arrays.fill(dp, -1);
        int option2 = robHouse(nums, dp, 1, n-1);
        
        return Math.max(option1, option2);
    }
    private int robHouse(int[] nums, int[] dp, int start, int end) {
        if(start > end) return 0;
        if(dp[start] != -1) return dp[start];
        int take = nums[start] + robHouse(nums, dp, start+2, end);
        int skip = robHouse(nums, dp, start+1, end);
        return dp[start] = Math.max(take, skip);
    }
}

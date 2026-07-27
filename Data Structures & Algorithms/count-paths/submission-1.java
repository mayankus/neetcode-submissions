class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int[] row : dp) {
            Arrays.fill(row, -1);
        }
        
        return countPaths(0, 0, m, n, dp);
    }
    private int countPaths(int row, int col, int m, int n, int[][] dp) {
        if(row == m-1 && col == n-1) return 1;
        if(row >= m || col >= n) return 0;
        if (dp[row][col] != -1)
            return dp[row][col];
        
        int right = countPaths(row, col+1, m, n, dp);
        int down = countPaths(row+1, col, m, n, dp);

        return dp[row][col] = right + down;
    }
}

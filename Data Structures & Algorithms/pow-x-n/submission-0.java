class Solution {
    public double myPow(double x, int n) {
        double ans = 1;
        int m = Math.abs(n);
        for(int i=0; i < m; i++){
            ans *= x;
        }
        
        return ans = n > 0 ? ans : 1/ans;
    }
}

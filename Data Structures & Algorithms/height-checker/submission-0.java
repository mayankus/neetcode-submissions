class Solution {
    public int heightChecker(int[] heights) {
        int ans = 0;
        int[] copy = Arrays.copyOf(heights, heights.length);
        Arrays.sort(copy);
        for(int i=0; i<copy.length; i++){
            if(copy[i] != heights[i]) ans++;
        }
        return ans;
    }
}
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        for(int i : nums) set.add(i);
        int max = 1;

        for(int i : set) {
            if(!set.contains(i-1)) {
                int curr = i;
                int len = 1;
                while(set.contains(curr+1)) {
                    len++;
                    curr++;
                }
                max = Math.max(max, len);
            }
        }
        return max;
    }
}

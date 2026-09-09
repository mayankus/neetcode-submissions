class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(nums);
        subset(ans, temp, nums, 0);
        return ans;
    }
    private void subset(List<List<Integer>> ans,List<Integer> temp, int[] nums, int start) {
        ans.add(new ArrayList<>(temp));
        for(int i=start; i<nums.length; i++) {
            if(i > start && nums[i] == nums[i-1]) continue;
            temp.add(nums[i]);
            subset(ans, temp, nums, i+1);
            temp.remove(temp.size()-1);
        }
    }
}

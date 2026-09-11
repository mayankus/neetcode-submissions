class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer> temp = new ArrayList<>();
        subset(nums, temp, target, 0);
        return ans;
    }

    private void subset(int[] nums, List<Integer> temp, int target, int start) {
        if(target < 0) return;
        if(target == 0) ans.add(new ArrayList<>(temp));
        for(int i=start; i<nums.length; i++) {
            temp.add(nums[i]);
            subset(nums, temp, target - nums[i], i);
            temp.remove(temp.size() - 1);
        }
    }
}

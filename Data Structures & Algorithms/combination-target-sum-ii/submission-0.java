class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(candidates);
        subset(candidates, temp, target, 0);

        return ans;
    }

    private void subset(int[] nums, List<Integer> temp, int target, int start) {
        if(target < 0) return;
        if(target == 0) ans.add(new ArrayList<>(temp));
        for(int i=start; i<nums.length; i++){
            if(i>start && nums[i] == nums[i-1]) continue;
            temp.add(nums[i]);
            subset(nums, temp, target-nums[i], i+1);
            temp.remove(temp.size()-1);
        }
    }
}

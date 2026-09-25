class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        subset(nums, temp, 0);
        return ans;
    }

    private void subset(int[] nums, List<Integer> temp, int start) {
        ans.add(new ArrayList<>(temp));
        for (int i = start; i < nums.length; i++) {
            temp.add(nums[i]);
            subset(nums, temp, i + 1);
            temp.remove(temp.size() - 1);
        }

    }
}

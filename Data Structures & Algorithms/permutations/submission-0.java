class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        subset(temp, nums);
        return ans;
    }

    private void subset (List<Integer> temp, int[] nums) {
        if(temp.size() == nums.length) {
            ans.add(new ArrayList<>(temp));
        }
        for(int i=0; i<nums.length; i++) {
            if(temp.contains(nums[i]))continue;
            temp.add(nums[i]);
            subset(temp, nums);
            temp.remove(temp.size() -1);
        }
    }
}

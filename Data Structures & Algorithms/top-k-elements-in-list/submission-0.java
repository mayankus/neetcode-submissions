class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer>[] freq = new List[n + 1];
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        System.out.println(map);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (freq[value] == null)
                freq[value] = new ArrayList<>();
            freq[value].add(key);
        }
        int[] ans = new int[k];
        int idx = 0;
        for (int i = n; i >= 1; i--) {
            if (freq[i] == null)
                continue;
            else {
                for (int num : freq[i]) {
                    ans[idx++] = num;
                    if (idx == k)
                        return ans;
                }
            }
        }
        return ans;
    }
}

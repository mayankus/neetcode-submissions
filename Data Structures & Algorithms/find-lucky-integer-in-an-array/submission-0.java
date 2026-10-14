class Solution {
    public int findLucky(int[] arr) {
        int ans = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : arr) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        for(int i : arr){
            if(i == map.get(i)){
                if (i > ans) ans = i;
            }
        }
        return ans;
    }
}
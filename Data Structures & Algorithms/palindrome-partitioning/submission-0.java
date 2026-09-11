class Solution {
    List<List<String>> ans = new ArrayList<>();
    public List<List<String>> partition(String s) {
        List<String> temp = new ArrayList<>();
        subset(s, temp, 0);
        return ans;
    }

    private void subset(String s, List<String> temp, int start) {
        if(start == s.length()){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for (int i = start; i < s.length(); i++) {
            String str = s.substring(start, i + 1);
            if (palindrome(str)) {
                temp.add(str);
                subset(s, temp, i + 1);
                temp.remove(temp.size() - 1);
            }
        }
    }

    private boolean palindrome(String s){
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}

class Solution {
    List<String> ans = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
         String[] map = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };
        if (digits.length() == 0) {
            return ans;
        }
        helper(digits, new StringBuilder(), 0, map);
        return ans;
    }
    private void helper(String digits, StringBuilder temp, int start, String[] map) {
        if(start == digits.length()) {
            ans.add(temp.toString());
            return;
        }
        String letters = map[digits.charAt(start) - '0'];
        for(int i=0; i<letters.length(); i++){
            temp.append(letters.charAt(i));
            helper(digits, temp, start+1, map);
            temp.deleteCharAt(temp.length()-1);
        }
    }
}

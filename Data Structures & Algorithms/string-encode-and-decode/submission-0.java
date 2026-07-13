class Solution {

    public String encode(List<String> strs) {
        StringBuilder ans = new StringBuilder();
        for(String s : strs){
            int length = s.length();
            ans.append(length);
            ans.append("#");
            ans.append(s);
        }
        return ans.toString();
    }

    public List<String> decode(String s) {
        List<String> ans = new ArrayList<>();
        int i = 0;
        StringBuilder res = new StringBuilder();
        while(i < s.length()) {
            int j = i;
            while(s.charAt(j) != '#') j++;
            int n = Integer.parseInt(s.substring(i, j));
            ans.add(s.substring(j+1, j+n+1));
            i = j+n+1;
        }
        return ans;
    }
}
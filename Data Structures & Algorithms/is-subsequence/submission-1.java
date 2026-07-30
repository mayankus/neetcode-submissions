class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j;
        if(s.length() < 1) return true;
        
        for(j=0; j<t.length(); j++) {
            if(s.charAt(i) == t.charAt(j)) i++;
            if(i == s.length()) return true;
        }
        return false;
    }
}

class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();
        for(String s : emails) {
            StringBuilder sb = new StringBuilder();
            int atIndex = s.indexOf('@');

            for(int i=0; i<atIndex; i++) {
                if(s.charAt(i) == '.') continue;
                else if(s.charAt(i) == '+') break;
                else sb.append(s.charAt(i));
            }
            sb.append(s.substring(atIndex, s.length()-1));
            set.add(sb.toString());
        }
        return set.size();
    }
}
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int[] target = new int[26];
        int[] window = new int[26];

        for(char c : s1.toCharArray()) {
            target[c - 'a']++;
        }

        int left = 0;
        int size = s1.length();

        for(int right =0; right < s2.length(); right++) {
            char rightChar = s2.charAt(right);
            window[rightChar - 'a']++;

            if(right - left + 1 > size) {
                char leftChar = s2.charAt(left);
                window[leftChar - 'a']--;
                left++;
            }
            if(Arrays.equals(target, window)) return true;
        }
        return false;
    }
}

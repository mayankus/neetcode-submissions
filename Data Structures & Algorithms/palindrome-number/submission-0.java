class Solution {
    public boolean isPalindrome(int x) {
        int num = x;
        int res = 0;
        while(num > 0){
            int rem = num % 10;
            res = (res * 10) + rem;
            num /= 10;
        }

        return res == x;
    }
}
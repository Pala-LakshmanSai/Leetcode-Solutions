class Solution {
    public boolean isPalindrome(int x) {
        int revnum = 0;
        int temp = x;
        while (x > 0){
            revnum = revnum * 10 + (x % 10);
            x = x / 10;
        }
        if(revnum == temp)
        return true;
        else
        return false;
    }
}
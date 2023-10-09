class Solution {
    public int numberOfSteps(int num) {
      return ans(num, count);  
    }
    public int count = 0;
    public int ans(int n, int count) {
        if(n == 0) {
            return count;
        }
        if(n % 2 == 0) {
            return ans(n / 2, count + 1);
        }        
        return ans(n - 1, count + 1);
    }
}
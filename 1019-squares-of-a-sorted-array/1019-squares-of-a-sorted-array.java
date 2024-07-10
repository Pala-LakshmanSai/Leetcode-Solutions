class Solution {
    public int[] sortedSquares(int[] nums) {
        int l = 0; 
        int r = nums.length - 1;
        int[] result = new int[nums.length];
        int k = nums.length - 1; 
        while ( r >= l) {
            int leftsquare = nums[l] * nums[l];
            int rightsquare = nums[r] * nums[r];
            if (leftsquare > rightsquare) {
                result[k] = leftsquare;
                l++;
            }
            else {
                result[k] = rightsquare;
                r--;
            }
            k--;
        }
        return result;
    }
}
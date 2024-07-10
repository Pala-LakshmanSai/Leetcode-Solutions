class Solution {
    public int removeDuplicates(int[] nums) {
        int r = 0;
        int l = 0;
        while (r < nums.length) {
            int count = 1;
            while (r + 1 < nums.length && nums[r] == nums[r + 1]) {
                r = r + 1;
                count = count + 1;
            }
            for (int i = 0; i < Math.min(count, 2); i++) {
                nums[l] = nums[r];
                l++;
            }
            r++;
        }
        return l;
    }
}
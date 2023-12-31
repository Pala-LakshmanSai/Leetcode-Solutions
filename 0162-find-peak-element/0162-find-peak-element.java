class Solution {
    public int findPeakElement(int[] nums) {
     int start = 0;
        int end = nums.length - 1;
        while(start < end){
            int middle = start + (end - start) / 2;
            if(nums[middle] < nums[middle + 1] ){
                start = middle + 1;
            }
            else{
                end = middle;
            }
        }
        return start;   
    }
}
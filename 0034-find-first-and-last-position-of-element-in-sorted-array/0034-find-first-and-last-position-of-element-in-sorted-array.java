class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] result = {-1, -1};
        result[0] = search(nums, target, true);
        result[1] = search(nums, target, false);
        return result;
    }
    int search(int[] arr, int target, boolean findStartIndex){
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if(arr[middle] == target){
                ans = middle;
                if (findStartIndex) {
                    end = middle - 1;
                }
                else{
                    start = middle + 1;
                }
            }
            else if (arr[middle] > target){
                end = middle -1;
            }
            else{
                start = middle + 1;
            }
        }
        return ans;
    } 

}
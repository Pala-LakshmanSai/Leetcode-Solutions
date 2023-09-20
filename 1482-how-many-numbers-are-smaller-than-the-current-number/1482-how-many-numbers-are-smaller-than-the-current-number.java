class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            ans[i] = smaller(nums, i);
        }
        return ans;
    }
    int smaller(int[] arr, int i){
        int count = 0;
        for(int j = 0; j <arr.length; j++){
            if(arr[j]<arr[i])
            count++;
        }
        return count;
    }
}
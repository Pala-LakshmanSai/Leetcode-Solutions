class Solution {
    public int firstMissingPositive(int[] nums) {
        cyclic(nums);
        for(int i = 0; i < nums.length; i++){
            if(i + 1 != nums[i]){
                return (i + 1);
            }
        }
        return nums.length + 1;
    }
    public void swap(int [] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public void cyclic(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] <= arr.length && arr[i] > 0 && arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
    }

}
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        cyclic(nums);
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i + 1){
                int correct = nums[i] - 1;
                if(nums[i] == nums[correct]){
                    result.add(nums[i]);
                }
            }
        }
        return result;
    }

    public static void cyclic(int[] arr){
        int i = 0;
        while( i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else{
                i++;
            }
        }
    }
}
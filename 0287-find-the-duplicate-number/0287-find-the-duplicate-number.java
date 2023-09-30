class Solution {
    public int findDuplicate(int[] nums) {
        cyclic(nums);
        return answer(nums);
    }
    static int answer(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != i + 1){
                int correct = arr[i] - 1;
                if(arr[i] == arr[correct]){
                    return arr[i];
                }
            }
        }
        return -1;
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
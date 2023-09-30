class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        cyclicSort(nums);
        return answer(nums);
    }
    public ArrayList<Integer> answer(int[] arr){
        ArrayList<Integer> result= new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != i + 1){
                result.add(i + 1);
            }
        }
        return result;
    }

    public void cyclicSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[correct] != arr[i]){
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
            }
            else{
                i++;
            }
        }
    }
}

class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(even(num))
            count++;
        }
        return count;
    }
    static boolean even(int n){
        int count = (int)(Math.log10(n))+1;
        if(count % 2 == 0){
            return true;
        }
        else
        return false;
    }
}
class Solution {
    public int maximumWealth(int[][] accounts) {
        int[] sum = new int[accounts.length];
        for(int i = 0; i < accounts.length; i++){
            for(int j = 0; j < accounts[i].length; j++){
                sum[i] += accounts[i][j];
            }
        }
        for(int i = 0; i < accounts.length; i++){
            System.out.println(sum[i]);
        }
        int max = 0;
        for(int i = 0; i < accounts.length; i++){
                if(sum[i]>max){
                max = sum[i];
                }
        }
        return max;
    }
}
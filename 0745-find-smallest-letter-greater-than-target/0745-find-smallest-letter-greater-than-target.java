class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start  = 0;
        int end = letters.length - 1;
        while(start <= end){
            int  middle = start + (end - start) / 2;
            if(letters[middle] > target){
                end = middle - 1;
            }
            else if(letters[middle] < target){
                start = middle + 1;
            }
            else{
                start = middle + 1;
            }       
        }
        if(target >= letters[letters.length - 1]){
            return letters[0];
        }
        else{
            return letters[start];
        }
    }
}
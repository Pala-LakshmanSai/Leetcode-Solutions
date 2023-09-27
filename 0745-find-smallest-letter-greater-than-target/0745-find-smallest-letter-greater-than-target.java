class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        return ceiling(letters, target);  
    }
    static char ceiling(char[] letters, char target){
        int start = 0;
        int end = letters.length - 1;
        while(start <= end){
            int middle = start + (end - start) / 2; 
            if(letters[middle] > target){
                end = end - 1;
            }
            else{
                start = start + 1;
            }
        }
        return letters[start % letters.length];
    }
}
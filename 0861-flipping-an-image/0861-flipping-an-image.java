class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] i : image){
            reverseArray(i);
            for(int j = 0; j < i.length; j++){
                i[j] = i[j]^1;
            }
        }
        return image;
    }
    public void reverseArray(int[] arr) {
        int start = 0; 
        int end = arr.length - 1;
        while ( start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
class Solution {
    public boolean checkIfPangram(String sentence) {
        for(int i = 97; i < 123; i++){
        if(!check(sentence, i)){
        return false;
        }        
    }
        return true;
}
    
    public boolean check(String sentence, int i){
        int count = 0;
        for(int j = 0; j < sentence.length(); j++){
            if(i == sentence.charAt(j)){
                count++;
            }
        }
        if(count >= 1)
        return true;
        else
        return false;
    }
}
class Solution {
    public String reversePrefix(String word, char ch) {
        int index = 0;
        for(int i = 0; i<word.length(); i++){
            if(word.charAt(i) == ch){
                index = i;
                break;
            }
        }
        String subStr = word.substring(0,index+1);
        String result = "";
        for(int i = index; i >=0 ; i--){
            result+=subStr.charAt(i);
        }
        String finalStr = result + word.substring(index+1, word.length()) ;
        return finalStr;
        
    }
}
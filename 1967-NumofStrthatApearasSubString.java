class Solution {
    public int numOfStrings(String[] patterns, String word) {

        List<String> wordList = new ArrayList<>();

        for(int i = 0; i< word.length(); i++){
            for(int j = i; j<word.length(); j++){
                String value = "";
                for(int k = i; k<=j; k++){
                    value += word.charAt(k);
                    wordList.add(value);
                }
            }
        }
        int c = 0;
        for(int i = 0; i<patterns.length; i++){
            if(wordList.indexOf(patterns[i]) != -1){
                c++;
            }
        }
        return c;
    }
}
class Solution {
    public int mostWordsFound(String[] sentences) {
        int c = 0;
        int max = -1;
        
        for(int i = 0; i < sentences.length; i++){
            c = 0;
          
            String new_s = sentences[i];
            
            for(int j = 0; j < sentences[i].length(); j++){
                
                if(new_s.charAt(j) == ' '){
                    c++;
                }
            }
            
            if(c+1 > max){
                max = c+1;
            }
            
        }
           return max;
    }
 
}
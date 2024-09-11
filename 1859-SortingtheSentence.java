class Solution {
    public String sortSentence(String s) {
        
        String new_s = "";
        String[] toppings = new String[10];
        int len = s.length();
        for(int i = 0; i < len ; i++){
           
           if(s.charAt(i) >='0' && s.charAt(i)<='9'){
               toppings[s.charAt(i)-'0'] = new_s;
               new_s ="";
           }
            else if(s.charAt(i) ==' '){
                continue;
            }
            else {
                new_s += s.charAt(i);
            }
          
        }
         int size = toppings.length;
         for (int i=1; i<size; i++)
        {
             if(toppings[i] !=null )
            { 
                new_s+= toppings[i]+" ";
            }
        }
        
    
        return new_s.trim();
        
    }
}
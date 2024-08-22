class Solution {
    public String restoreString(String s, int[] indices) {
        
        String [] strings = new String[indices.length];
        StringBuilder new_s = new StringBuilder();
        
        for(int i = 0; i< s.length(); i++){
            
            String s1= Character.toString(s.charAt(i));
            strings[indices[i]] = s1;
        }
        
        for(int i = 0; i< strings.length; i++){
            new_s.append(strings[i]);
            
        }
        
        return new_s.toString();
        
    }
}
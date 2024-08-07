
class Solution {
    public boolean isAnagram(String s, String t) {
        
        char[] data_s = new char[100000];
        char[] data_t = new char[100000];
        
        int length_s = s.length();
        int length_t = t.length();
        
        for(int i = 0; i < length_s; i++){
            data_s[i] = s.charAt(i);
        }
         for(int i = 0; i < length_t; i++){
            data_t[i] = t.charAt(i);
        }
        Arrays.sort(data_s);
        Arrays.sort(data_t);
        
        if(Arrays.equals(data_s,data_t)){
            return true;
        }
        else{
            return false;
        }
        
       
        
    }
}
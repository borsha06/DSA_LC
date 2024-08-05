class Solution {
    public void reverseString(char[] s) {
        StringBuilder s1 = new StringBuilder();
        s1.append(s); 

        for(int i = s1.length()-1; i>=0; i--){
            s[s1.length()-1 -i] = s1.charAt(i);
        }
      
    }
}
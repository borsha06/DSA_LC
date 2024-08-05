class Solution {
    public String replaceDigits(String s) {
        StringBuilder s1 = new StringBuilder();
        s1.append(s);
        for(int i = 0; i<s1.length()-1; i+=2){
            int chars = s1.charAt(i);
            int nums = Integer.parseInt(s1.charAt(i+1) + "");
            String str = (char)((chars + nums)) + "";
            s1.replace(i+1, i+2, str);
        }
        return s1.toString();    
    }

}
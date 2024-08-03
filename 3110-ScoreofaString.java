class Solution {
    public int scoreOfString(String s) {
        int sum = 0;

        for(int i = 0; i<s.length()-1; i++){
            int charA = s.charAt(i);
            int charB = s.charAt(i+1);
                sum+= Math.abs(charA - charB);
        }
        return sum;
    }
}
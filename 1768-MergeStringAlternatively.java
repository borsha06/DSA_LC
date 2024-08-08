class Solution {
    public String mergeAlternately(String word1, String word2) {

        int l1 = word1.length();
        int l2 = word2.length();
        String s = "";

        if (l1 == l2) {
            for (int i = 0; i < l1; i++) {
                s += word1.charAt(i);
                s += word2.charAt(i);

            }
        } else if (l1 < l2) {
            for (int i = 0; i < l1; i++) {
                s += word1.charAt(i);
                s += word2.charAt(i);
            }
            s += word2.substring(l1);
        } else if (l1 > l2) {
            for (int i = 0; i < l2; i++) {
                s += word1.charAt(i);
                s += word2.charAt(i);
            }
            s += word1.substring(l2);
        }
        return s;
    }
}
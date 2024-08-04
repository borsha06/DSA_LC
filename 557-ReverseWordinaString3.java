class Solution {
    public String reverseWords(String s) {
        String reversed = "";
        int index = 0;
        StringBuilder str = new StringBuilder();
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            StringBuilder str1 = new StringBuilder();
            str1.append(words[i]);
            str1.reverse();
            str.append(str1);
            if (i < words.length - 1) {
                str.append(" ");
            }
        }

        return str.toString();
    }
}
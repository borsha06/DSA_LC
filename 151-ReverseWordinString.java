class Solution {
    public String reverseWords(String s) {
        String reversed = "";
        int index = 0;
        StringBuilder str = new StringBuilder();
        s = s.trim().replaceAll(" +", " ");
        String[] words = s.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            StringBuilder str1 = new StringBuilder();
            str1.append(words[i]);
            str.append(str1);
            if (i > 0) {
                str.append(" ");
            }
        }

        return str.toString();
    }
}
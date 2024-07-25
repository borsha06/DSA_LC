class Solution {
    public String firstPalindrome(String[] words) {

        for (int i = 0; i < words.length; i++) {
            boolean backward = checkPallindrome(words[i]);
            if (backward) {
                return words[i];
            } else if (i > words.length - 1)
                return "";
        }

        return "";

    }

    public boolean checkPallindrome(String word) {

        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        if (reversed.equals(word)) {
            return true;
        } else
            return false;

    }
}
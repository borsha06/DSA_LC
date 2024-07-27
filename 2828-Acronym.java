class Solution {
    public boolean isAcronym(List<String> words, String s) {

        String chars = "";

        for (String word : words) {

            chars += word.charAt(0);
        }

        if (chars.equals(s)) {
            return true;
        } else
            return false;

    }
}
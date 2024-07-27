class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int result = 0;
        for (int i = 0; i < words.length; i++) {

            int c = 0;
            int size = 0;
            for (int j = 0; j < words[i].length(); j++) {
                size = words[i].length();
                String word = words[i];
                int value = allowed.indexOf(word.charAt(j));

                if (value > -1) {
                    c++;
                }

            }
            if (c == size) {
                result++;
            }

        }

        return result;
    }
}
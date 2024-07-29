class Solution {
    public int maximumNumberOfStringPairs(String[] words) {

        int c = 0;

        for (int i = 0; i < words.length - 1; i++) {

            for (int j = i + 1; j < words.length; j++) {

                String firstWord = words[i];
                String secondWord = words[j];
                String revSecWord = reversedW(secondWord);
                if (firstWord.equals(revSecWord)) {
                    c++;
                }

            }

        }

        return c;

    }

    public String reversedW(String word) {

        String rev = "";
        int lengthW = word.length();
        for (int i = lengthW - 1; i >= 0; i--) {
            rev += word.charAt(i);
        }
        return rev;

    }
}
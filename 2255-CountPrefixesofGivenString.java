class Solution {
    public int countPrefixes(String[] words, String s) {

        List<String> wordList = new ArrayList<String>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                String w = "";
                for (int k = i; k <= j; k++) {
                    w += s.charAt(k);
                }
                wordList.add(w);
            }
            i = s.length();
        }
        int c = 0;
        for (int i = 0; i < words.length; i++) {
            if (wordList.contains(words[i])) {
                c++;
            }
        }
        return c;
    }
}
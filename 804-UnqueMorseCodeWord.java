class Solution {
    public int uniqueMorseRepresentations(String[] words) {

        String[] table = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };

        Set<String> count = new HashSet<>();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String transform = "";
            String change = "";
            for (int j = 0; j < word.length(); j++) {
                int chars = word.charAt(j);
                transform += table[(chars-97)];
            }
            count.add(transform);
        }

         return count.size();

    }
}
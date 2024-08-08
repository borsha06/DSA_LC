class Solution {
    public int countCharacters(String[] words, String chars) {
        int length = 0;
        HashMap<Character, Integer> charsMap = new HashMap<>();

        for (int i = 0; i < chars.length(); i++) {
            if (charsMap.containsKey(chars.charAt(i)) == false) {
                charsMap.put(chars.charAt(i), 1);
            } else if (charsMap.containsKey(chars.charAt(i)) == true) {
                int value = charsMap.get(chars.charAt(i));
                charsMap.put(chars.charAt(i), value += 1);
            }
        }

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int c = 0;
            HashMap<Character, Integer> wordsMap = new HashMap<>();
            for (int j = 0; j < word.length(); j++) {
                if (wordsMap.containsKey(word.charAt(j)) == false) {
                    wordsMap.put(word.charAt(j), 1);
                } else if (wordsMap.containsKey(word.charAt(j)) == true) {
                    int value = wordsMap.get(word.charAt(j));
                    wordsMap.put(word.charAt(j), value += 1);
                }

            }
            for (Character key : wordsMap.keySet()) {
                int value = wordsMap.get(key);
                if (charsMap.containsKey(key) == true && charsMap.get(key) >= value) {
                    c++;
                    System.out.println(c);
                } else if (charsMap.containsKey(key) == false) {
                    c = 0;
                    break;
                } else if (charsMap.containsKey(key) == true && charsMap.get(key) < value) {
                    c = 0;
                    break;
                }
            }

            if (c >= 1) {
                length += word.length();
            }

        }
        return length;
    }
}
class Solution {
    public String[] findWords(String[] words) {

        List<String> result = new ArrayList<>();

        List<String> keyboard = Arrays.asList("qwertyuiop", "asdfghjkl", "zxcvbnm");
        for (int i = 0; i < words.length; i++) {
            int c = 0;

            String wordOriginal = words[i];
            String word = words[i].toLowerCase();
            int c1 = 0;
            int c2 = 0;
            int c3 = 0;
            for (int j = 0; j < word.length(); j++) {
                int index = -1;
                int prevIndex = -1;
                for (int k = 0; k < keyboard.size(); k++) {

                    if (keyboard.get(k).indexOf(word.charAt(j)) != -1) {
                        index = k;
                        if (k == 0) {
                            c1 = 1;
                            k = 3;
                        } else if (k == 1) {
                            c2 = 1;
                            k = 3;
                        } else {
                            c3 = 1;
                            k = 3;

                        }
                    }

                }
                System.out.println(c1 + c2 + c3);

            }
            if (c1 + c2 + c3 == 1) {
                result.add(wordOriginal);
            } else {
                continue;
            }
        }

        String[] array = new String[result.size()];
        result.toArray(array);

        return array;

    }
}
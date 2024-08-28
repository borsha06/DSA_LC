class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> diff1 = new HashMap<>();
        Map<Character, Integer> diff2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (diff1.containsKey(s.charAt(i)) == false) {
                diff1.put(s.charAt(i), 1);
            } else if (diff1.containsKey(s.charAt(i)) == true) {
                int value = diff1.get(s.charAt(i));
                diff1.put(s.charAt(i), value += 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (diff2.containsKey(t.charAt(i)) == false) {
                diff2.put(t.charAt(i), 1);
            } else if (diff2.containsKey(t.charAt(i)) == true) {
                int value = diff2.get(t.charAt(i));
                diff2.put(t.charAt(i), value += 1);
            }
        }
        if (s.length() > t.length()) {

            for (Character key : diff1.keySet()) {
                if (diff1.get(key) != diff2.get(key)) {
                    return key;

                }
            }
        } else {
            for (Character key : diff2.keySet()) {
                if (diff1.get(key) != diff2.get(key)) {
                    return key;

                }
            }
        }

        return '\0';
    }
}
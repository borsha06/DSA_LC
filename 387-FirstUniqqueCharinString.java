class Solution {
    public int firstUniqChar(String s) {

        HashMap<Character, Integer> sMap = new LinkedHashMap<>();
        Character ch = null;

        for (int i = 0; i < s.length(); i++) {
            if (sMap.containsKey(s.charAt(i)) == false) {
                sMap.put(s.charAt(i), 1);
            } else if (sMap.containsKey(s.charAt(i)) == true) {
                int value = sMap.get(s.charAt(i));
                sMap.put(s.charAt(i), value += 1);
            }
        }
        for (Character ch1 : sMap.keySet()) {
            if (sMap.get(ch1) == 1) {
                ch = ch1;
                break;
            }
        }
        if (ch != null) {
            int index = s.indexOf(ch);
            return index;
        }
        return -1;

    }
}
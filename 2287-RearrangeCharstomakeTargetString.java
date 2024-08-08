class Solution {
    public int rearrangeCharacters(String s, String target) {

        HashMap<Character, Integer> targetMap = new HashMap<>();
        HashMap<Character, Integer> sMap = new HashMap<>();

        for (int i = 0; i < target.length(); i++) {
            if (targetMap.containsKey(target.charAt(i)) == false) {
                targetMap.put(target.charAt(i), 1);
            } else if (targetMap.containsKey(target.charAt(i)) == true) {
                int value = targetMap.get(target.charAt(i));
                targetMap.put(target.charAt(i), value += 1);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (sMap.containsKey(s.charAt(i)) == false) {
                sMap.put(s.charAt(i), 1);
            } else if (sMap.containsKey(s.charAt(i)) == true) {
                int value = sMap.get(s.charAt(i));
                sMap.put(s.charAt(i), value += 1);
            }
        }

        int ans = 20000;
        for (Character key : targetMap.keySet()) {
            if (sMap.containsKey(key) == false) {
                return 0;
            }
            ans = Math.min(sMap.get(key) / targetMap.get(key), ans);
        }
        return ans;

    }
}

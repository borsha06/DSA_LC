class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<String, Integer> ransomNoteMap = new HashMap<String, Integer>();

        HashMap<String, Integer> magazineMap = new HashMap<String, Integer>();

        for (int i = 0; i < ransomNote.length(); i++) {
            char character = ransomNote.charAt(i);
            String str = Character.toString(character);
            System.out.println(str);
            if (!(ransomNoteMap.containsKey(str))) {
                ransomNoteMap.put(str, 1);
            } else {
                ransomNoteMap.put(str, (ransomNoteMap.get(str)) + 1);
            }

        }

        for (int i = 0; i < magazine.length(); i++) {
            char character = magazine.charAt(i);
            String str = Character.toString(character);
            System.out.println(str);
            if (!(magazineMap.containsKey(str))) {
                magazineMap.put(str, 1);
            } else {
                magazineMap.put(str, (magazineMap.get(str)) + 1);
            }

        }

        Set<String> keys = ransomNoteMap.keySet();
        int c = 0;
        for (String i : keys) {
            if (ransomNoteMap.containsKey(i) && magazineMap.containsKey(i)
                    && magazineMap.get(i) >= ransomNoteMap.get(i)) {
                c++;
            } else {
                c = 0;
            }
        }
        if (c == keys.size()) {
            return true;
        } else
            return false;
    }
}
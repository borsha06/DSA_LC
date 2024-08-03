class Solution {
    public String finalString(String s) {
        StringBuilder str = new StringBuilder();
        int index = 0;
        int c = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'i') {
                str.append(s.charAt(i));
            }
            if (s.charAt(i) == 'i') {

                str.reverse();

            }
        }

        return str.toString();

    }
}
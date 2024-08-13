class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s = strs[0];
        String res = "";
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            int c = 0;
            String ch = String.valueOf(s.charAt(i));
            res += ch;
            for (int l = 1; l < strs.length; l++) {
                String s2 = strs[l];
                if (s2.contains(res) && s2.indexOf(res) == 0) {
                    c++;
                    System.out.println(c);
                } else {
                    c = 0;
                    break;
                }
            }
            if (c == strs.length - 1) {
                result = res;
            }
        }
        if (result.length() > 0) {
            return result;
        } else {
            return "";
        }
    }
}
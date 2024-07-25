class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int index = findKey(ruleKey);

        int c = 0;
        for (int i = 0; i < items.size(); i++) {

            System.out.print(", " + items.get(i).get(index));

            if ((items.get(i).get(index)).equals(ruleValue)) {
                c++;
            }
        }
        return c;
    }

    public int findKey(String ruleKey) {

        int find = 0;
        System.out.println(ruleKey);
        if (ruleKey.equals("color")) {
            System.out.println(ruleKey);
            find = 1;
        } else if (ruleKey.equals("name")) {
            find = 2;
        }
        System.out.println(find);
        return find;

    }

}
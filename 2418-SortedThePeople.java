class Solution {
    public String[] sortPeople(String[] names, int[] heights) {

        HashMap<Integer, String> persons = new HashMap<Integer, String>();

        for (int i = 0; i < names.length; i++) {

            persons.put(heights[i], names[i]);

        }
        Map<Integer, String> sortedTreeMap = new TreeMap<Integer, String>(Comparator.reverseOrder());
        sortedTreeMap.putAll(persons);
        List<String> nameList = new ArrayList<>();

        for (String value : sortedTreeMap.values()) {

            nameList.add(value);
        }
        String[] SortedNames = nameList.toArray(new String[nameList.size()]);
        return SortedNames;

    }

}
class Solution {
    public String destCity(List<List<String>> paths) {
        String city = "";
        List<String> source = new ArrayList<>();
        List<String> destination = new ArrayList<>();
        if (paths.size() == 1) {
            return paths.get(0).get(1);
        }
        for (int i = 0; i < paths.size(); i++) {

            source.add(paths.get(i).get(0));
            destination.add(paths.get(i).get(1));
        }
        for (int i = 0; i < destination.size(); i++) {
            if (source.contains(destination.get(i)) == false) {
                city = destination.get(i);
            }
        }

        return city;

    }
}
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue = new LinkedList<>();
        int sandC = 0;
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            queue.add(students[i]);
        }

        Iterator<Integer> itr = queue.iterator();
        while (itr.hasNext()) {
            int v = queue.peek();
            if (v == sandwiches[sandC]) {
                queue.remove();
                sandC++;
                count = 0;
            } else {
                queue.add(v);
                queue.poll();
                count++;
            }
            if (sandC == sandwiches.length || count == queue.size()) {
                break;
            }

        }
        if (queue.size() == 0)
            return 0;
        return queue.size();
    }
}
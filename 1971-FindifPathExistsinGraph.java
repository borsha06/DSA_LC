class Solution {

    void printGraph(int n) {
        for (int i = 0; i < n; i++) {
            for (int x : graph.get(i)) {
            }
        }
    }

    ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

    public boolean validPath(int n, int[][] edges, int source, int destination) {

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        boolean result = false;

        addEdge(edges, n);
        result = BFS(source, destination, n);
        return result;

    }

    void addEdge(int[][] edges, int n) {
        for (int i = 0; i < edges.length; i++) {
            int u = 0;
            int v = 0;
            u = edges[i][0];
            v = edges[i][1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        printGraph(n);
    }

    boolean BFS(int start, int dest, int n) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n];
        queue.add(start);
        visited[start] = true;
        int y = 0;
        while (!queue.isEmpty()) {
            y = queue.poll();
            for (int j = 0; j < graph.get(y).size(); j++) {
                if (visited[graph.get(y).get(j)] == false)
                    queue.add(graph.get(y).get(j));
                visited[graph.get(y).get(j)] = true;
            }
            if (y == dest) {
                return true;
            }
        }

        return false;
    }

}
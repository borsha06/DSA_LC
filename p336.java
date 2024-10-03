/* Online Java Compiler and Editor */
import java.util.*;

public class HelloWorld {
    Map<Integer, List<Integer>> graph;
    Map<Integer, Integer> levels;

    public HelloWorld() {

        graph = new HashMap<>();
        levels = new HashMap<>();
    }

    void addEdge(int u, int v) {
        graph.computeIfAbsent(u, x -> new ArrayList<>()).add(v);
        graph.computeIfAbsent(v, x -> new ArrayList<>()).add(u);
    }
    void printGraph() {

        for (int vertex : graph.keySet()) {
            System.out.print(vertex + " -> ");
            for (int neighbor : graph.get(vertex)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
    void BFS(int start, int ttl) {
        // printGraph();
        Queue<Integer> queue = new LinkedList<>();
        Integer c = 0;
        boolean[] visited = new boolean[1000];
        queue.add(start);
        levels.put(start, c);
        visited[start] = true;
        while(!queue.isEmpty()) {
            int y = queue.poll();
            c = levels.get(y) + 1;
            for (int j = 0; j < graph.get(y).size(); j++) {
                Integer neighbor = graph.get(y).get(j);
                if(levels.containsKey(neighbor) == false) {
                    levels.put(neighbor, c);
                }
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
        int res = 0;
       for(int level: levels.keySet()){
           if(levels.get(level) > ttl){
               res++;
           }
       }
        System.out.println(res);
    }

    public static void main(String []args) {
        System.out.println("Hello, World!");
        HelloWorld g = new HelloWorld();
        Scanner myObj = new Scanner(System.in);
        int num = myObj.nextInt();
        for(int i =0; i < num; i++) {
            int u = myObj.nextInt();
            int v = myObj.nextInt();
            g.addEdge(u,v);
        }

        g.BFS(35,3);
    }
}
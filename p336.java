/* Online Java Compiler and Editor */
import java.util.*;

public class HelloWorld {
    Map<Integer, List<Integer>> graph;

    public HelloWorld() {
    
        graph = new HashMap<>();
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
    void BFS(int start){
         printGraph();
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[1000];
        queue.add(start);
        visited[start] = true;
        while(!queue.isEmpty()){
            int y = queue.poll();
            System.out.println(graph.get(y));
             for (int j = 0; j < graph.get(y).size(); j++) {
            int neighbor = graph.get(y).get(j); // Get the neighbor vertex
            if (!visited[neighbor]) { // Check if the neighbor has not been visited
                visited[neighbor] = true; // Mark it as visited
                queue.add(neighbor); // Add it to the queue
            }
        }
            System.out.println(y);
        }
    }

    public static void main(String []args) {
        System.out.println("Hello, World!");
         HelloWorld g = new HelloWorld();
        Scanner myObj = new Scanner(System.in);
        int num = myObj.nextInt();
        for(int i =0; i < num; i++){
            int u = myObj.nextInt();
            int v = myObj.nextInt();
            g.addEdge(u,v);
        }
        // HelloWorld g = new HelloWorld(5);
      
        g.BFS(35);
    }
}
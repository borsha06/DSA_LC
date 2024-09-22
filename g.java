/* Online Java Compiler and Editor */
import java.util.*;

public class HelloWorld {
    ArrayList<ArrayList<Integer>> graph;
    int nodes;

    public HelloWorld(int node) {
        nodes = node;
        graph = new ArrayList<ArrayList<Integer>> ();
        for(int i = 0; i< nodes; i++) {
            graph.add(new ArrayList<Integer> ());
        }
    }

    void addEdge(int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }
    void printGraph() {
        for(int i = 0; i< nodes; i++) {
            System.out.println("Nodes: " + i);
            for(int x : graph.get(i)){
                 System.out.println("Connected: " + x);
            }
        }
    }
    void BFS(int start){
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[nodes];
        queue.add(start);
        visited[start] = true;
        while(!queue.isEmpty()){
            int y = queue.poll();
            for(int j = 0; j < graph.get(y).size(); j++){
                if(visited[graph.get(y).get(j)] == false)
                 queue.add(graph.get(y).get(j));
                 visited[graph.get(y).get(j)] =true;
            }
            System.out.println(y);
        }
        printGraph();
    }

    public static void main(String []args) {
        System.out.println("Hello, World!");
        HelloWorld g = new HelloWorld(5);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(0,3);
        g.addEdge(0,4);
        g.BFS(0);
    }
}
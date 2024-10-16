/* Online Java Compiler and Editor */
import java.util.*;

public class HelloWorld {
    ArrayList<ArrayList<Integer>> graph;
    int nodes;

    public HelloWorld(int node) {
        nodes = node;
        graph = new ArrayList<ArrayList<Integer>> ();
        for(int i = 0; i<= nodes; i++) {
            graph.add(new ArrayList<Integer> ());
        }
    }

    void addEdge(int u, int v) {
        graph.get(u).add(v);
    }
    void printGraph() {
       
        for(int i = 0; i<= nodes; i++) {
            System.out.println("Nodes: " + i);
            for(int x : graph.get(i)) {
                System.out.println("Connected: " + x);
            }
        }
       
    }
    void BFS(int start) {
        printGraph();
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[nodes];
        ArrayList <Integer> connected = new ArrayList<Integer>();
        queue.add(start);
        visited[start] = true;
        while(!queue.isEmpty()) {
            int y = queue.poll();
            for(int j = 0; j < graph.get(y).size(); j++) {
                if(visited[graph.get(y).get(j)] == false)
                    queue.add(graph.get(y).get(j));
                visited[graph.get(y).get(j)] =true;
                if(y == graph.get(y).get(j)){
                    connected.add(y);
                }
            }
            
            System.out.println(y);
        }
       for(int i = 1; i<= nodes; i++){
           for(int j = 0; j<connected.size(); j++){
               if(i != connected.get(j)){
                   System.out.println(i);
               }
           }
       }
    }

    public static void main(String []args) {
        System.out.println("Hello, World!");
        Scanner myObj = new Scanner(System.in);
        int num = myObj.nextInt();
        HelloWorld g = new HelloWorld(num);
        g.addEdge(1,2);
        g.addEdge(2,2);
        g.addEdge(3,1);
        g.addEdge(3,2);
        g.BFS(1);
        g.BFS(2);
    }
}
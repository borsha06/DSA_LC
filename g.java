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

    public static void main(String []args) {
        System.out.println("Hello, World!");
        HelloWorld g = new HelloWorld(5);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(0,3);
        g.addEdge(0,4);
        g.printGraph();
    }
}
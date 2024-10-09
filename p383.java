/* Online Java Compiler and Editor */
import java.util.*;

public class HelloWorld {
    Map<String, List<String>> graph;
    Map<String, Integer> levels;

    public HelloWorld() {

        graph = new HashMap<>();
        levels = new HashMap<>();
    }

    void addEdge(String u, String v) {
        graph.computeIfAbsent(u, x -> new ArrayList<>()).add(v);
        graph.computeIfAbsent(v, x -> new ArrayList<>()).add(u);
        System.out.println(graph);
    }
    void printGraph() {

        for (String vertex : graph.keySet()) {
            System.out.print(vertex + " -> ");
            for (String neighbor : graph.get(vertex)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
    void BFS(int a, String start, String dest) {
        System.out.println(graph);
        if(graph.containsKey(start) == false || graph.containsKey(dest) == false ) {
            System.out.println("no");
        } else {
            printGraph();
            Map<String, Boolean> visited = new HashMap<>();
            Queue<String> queue = new LinkedList<>();
            Integer c = 0;
            queue.add(start);
            levels.put(start, c);
            System.out.println(start);
            visited.put(start, true);
            while(!queue.isEmpty()) {
                String y = queue.poll();
                c = levels.get(y) + 1;
                List<String> neighbors = graph.getOrDefault(y, new ArrayList<>());
                for (String neighbor : neighbors) {
                    if(levels.containsKey(neighbor) == false) {
                        levels.put(neighbor, c);
                        System.out.println(levels);
                    }
                    if (!visited.containsKey(neighbor)) {
                        visited.put(neighbor , true);
                        queue.add(neighbor);
                    }
                }
            }
            if(graph.containsKey(dest) == false) {
                System.out.println("not");
            } else {
                Integer destLeg = levels.get(dest);
                System.out.println(a* destLeg*100);
            }
        }

    }

    public static void main(String []args) {
        HelloWorld g = new HelloWorld();
        List<String> spots = new ArrayList<>();
        Scanner myObj = new Scanner(System.in);
        int num = myObj.nextInt();
        for(int i =0; i < num; i++) {
            int u = myObj.nextInt();
            int v = myObj.nextInt();
            int w = myObj.nextInt();
            myObj.nextLine();
            String ch = myObj.nextLine();
            String[] charList = ch.split(" ");
            for(int m = 0;  m< charList.length; m++) {
                spots.add(charList[m]);
            }
            for(int k = 0; k< v; k++) {
                String input = myObj.nextLine();
                String[] splitted = input.split(" ");
                String x = splitted[0];
                String y = splitted[1];
                g.addEdge(x,y);
            }
            for(int l = 0; l < w; l++) {
                String input2 = myObj.nextLine();
                String[] splitted2 = input2.split(" ");
                int a = Integer.parseInt(splitted2[0]);
                String b = splitted2[1];
                String c = splitted2[2];
                g.BFS(a,b,c);
            }
        }

        //  g.BFS("AA","BB");
    }
}
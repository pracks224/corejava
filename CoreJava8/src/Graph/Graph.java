package Graph;

import java.util.ArrayList;

public class Graph {
    public static void main(String[] args) {
       int V =7;
       ArrayList<Edge> graph[] = new ArrayList[V];
       createGraph(graph);
       /*
           0------>1 ,2
           1------>0,3
       */

    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[4].add(new Edge(5, 3));
        graph[4].add(new Edge(5, 4));
        graph[4].add(new Edge(5, 5));
        graph[4].add(new Edge(5, 6));

    }
}

package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
/*
1.	Find the level of a given node in an Undirected Graph	Link
2.	Minimize maximum adjacent difference in a path from top-left to bottom-right	Link
3.	Minimum jump to the same value or adjacent to reach the end of an Array	Link
4.	Maximum coin in minimum time by skipping K obstacles along the path in Matrix	Link
5.	Check if all nodes of the Undirected Graph can be visited from the given Node	Link
6.	Minimum time to visit all nodes of a given Graph at least once	Link
7.	Minimize moves to the next greater element to reach the end of the Array	Link
8.	Shortest path by removing K walls	Link
9.	Minimum time required to infect all the nodes of the Binary tree	Link
10.	Check if destination of given Matrix is reachable with required values of cells
*/

public class BFS {
    public static final int V = 7;

    public static void main(String[] args) {
        //Create Graph
        ArrayList<Edge> graph[] = new ArrayList[V];
        Graph.createGraph(graph);
        bfs(graph);
    }
    //O(V+E)
    public static void bfs(ArrayList<Edge> graph[]) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[V];
        q.add(0);

        while (!q.isEmpty()) {
            int current = q.poll();
            if (visited[current] == false) {
                System.out.print(current+" ");
                visited[current] = true;
                for (int i = 0; i < graph[current].size(); i++) {
                    Edge e = graph[current].get(i);
                    q.add(e.dest);
                }
            }
        }
    }


}



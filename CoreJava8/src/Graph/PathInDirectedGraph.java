package Graph;

import java.util.*;

public class PathInDirectedGraph {
    public static void main(String[] args) {
        int n = 6;
        int[][] edges = {{0, 1}, {0, 2}, {3, 5}, {5, 4}, {4, 3}};
        int source = 0;
        int destination = 5;
        System.out.println(validPath(n, edges, source, destination));
    }


    public static boolean validPath(int n, int[][] edges, int source, int destination) {
        final boolean[] visited = new boolean[n];

        //BFS  APPROACH
        final Queue<Integer> bfs = new LinkedList<>();
        //start bfs from the source given
        bfs.add(source);
        visited[source] = true;
        while (!bfs.isEmpty()) {
            final int currentVertex = bfs.poll();
            //if the destination is present in the bfs of the
            //source vertex then there exists a path to destination
            if (currentVertex == destination) {
                return true;
            }
            final Set<Integer> neighbours = findNeighbours(edges, n, currentVertex);
            for (final int neighbour : neighbours) {
                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    bfs.add(neighbour);
                }
            }

        }
        return false;
    }

    //function to find neighbouring vertex of the current traversing vertex
    //from the edges list given
    private static Set<Integer> findNeighbours(int[][] edges, int n, int v) {
        final Set<Integer> neighbours = new HashSet<>();

        //if one of the edge in nested list is being cuurently traversed
        //then add the remaining other vertex from the nested list edge as its neighbour
        for (int[] edge : edges) {
            if (edge[0] == v) {
                neighbours.add(edge[1]);
            } else if (edge[1] == v) {
                neighbours.add(edge[0]);
            }
        }
        return neighbours;
    }
}

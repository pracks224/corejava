package Graph;

import java.util.ArrayList;

/*
Depth-first search is an algorithm for traversing or searching tree or graph data structures.
The algorithm starts at the root node (selecting some arbitrary node as the root node in the case of a graph)
and explores as far as possible along each branch before backtracking.
So the basic idea is to start from the root or any arbitrary node and mark the node and move to
the adjacent unmarked node and continue this loop until there is no unmarked adjacent node.
Then backtrack and check for other unmarked nodes and traverse them. Finally, print the nodes in the path.
 */
public class DFS {
    public static final int V = 7;
    static boolean[] visited = new boolean[V];

    public static void main(String[] args) {

        ArrayList<Edge>[] graph = new ArrayList[V];
        Graph.createGraph(graph);
        dfs(graph, 0, visited);
    }

    public static void dfs(ArrayList<Edge>[] graph, int current, boolean[] visited) {
        System.out.print(current + " ");
        visited[current] = true;
        for (int i = 0; i < graph[current].size(); i++) {
            Edge e = graph[current].get(i);
            if (!visited[e.dest])
                dfs(graph, e.dest, visited);
        }


    }
}

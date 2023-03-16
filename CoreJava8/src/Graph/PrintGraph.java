package Graph;

import java.util.ArrayList;

public class PrintGraph {

    private static final int vertices = 5;
    private static ArrayList<Integer>[] adj = new ArrayList[vertices];
    private static ArrayList<Integer>[] transpose = new ArrayList[vertices];

    // boolean flag is for later to use for transpose
    public static void addEdges(int source, int v, boolean flag) {
        if (flag) {
            adj[source].add(v);
        } else {
            transpose[source].add(v);
        }
    }
    public static void printGraph(ArrayList<Integer>[] graph){
        for(int i =0;i<vertices;i++){
            System.out.println("Vertex--->"+i);
            for(int j=0;j<graph[i].size();j++){
                System.out.println("Edges to --->"+graph[i].get(j));
            }
        }
    }

    public static void getTranspose(){
        for(int i =0;i<vertices;i++){
            for(int j=0;j<adj[i].size();j++){
                addEdges(adj[i].get(j),i,false);
            }
        }
    }
    public static void main(String[] args) {

        for (int i = 0; i < vertices; i++) {
            adj[i] = new ArrayList<Integer>();
            transpose[i] = new ArrayList<Integer>();
        }
        addEdges(0, 1, true);
        addEdges(0, 4, true);
        addEdges(0, 3, true);
        addEdges(2, 0, true);
        addEdges(3, 2, true);
        addEdges(4, 1, true);
        addEdges(4, 3, true);

        printGraph(adj);
        getTranspose();
        System.out.println("=========================== Trasponse of Graph ===========");
        printGraph(transpose);


    }
}

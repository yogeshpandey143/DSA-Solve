package graph;

import java.util.*;

class Edge{
    int src;
    int dest;

    public Edge(int src,int dest)
    {
        this.src=src;
        this.dest=dest;
    }
}

public class GraphStoreAl {
    public static void createGrapgh(ArrayList[] graph, int v)
     {
         for(int  i=0;i<v;i++)
         {
           graph[i]= new ArrayList<Edge>();

         }
          // adding edge into the array of given index
         graph[0].add(new Edge(0,1));
         graph[0].add(new Edge(0,2));

         graph[1].add(new Edge(1,0));
         graph[1].add(new Edge(1,2));


         graph[2].add(new Edge(2,0));
         graph[2].add(new Edge(2,1));


     }
    public static void main(String[] args) {
        int v = 4;
     ArrayList[] graph = new ArrayList[v];
     createGrapgh(graph,v);
    }

}

package graph;

import java.util.ArrayList;

public class TreeDetection {

    class Edge{
        int src;
        int dest;

        public Edge(int src,int dest)
        {
            this.src=src;   // source that is current vetex
            this.dest=dest;// destination by which current is connected
        }
    }

    public  void createGrapgh(ArrayList[] graph, int v)
    {
        for(int  i=0;i<v;i++)
        {

            // Adding ArrayList to all indexs of given array
            graph[i]= new ArrayList<graph.Edge>();

        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,4));

        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,4));
        graph[1].add(new Edge(1,0));

        graph[2].add(new Edge(2,3));
        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3,2));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,4));


    }

     public boolean treedetect(ArrayList<Edge> graph[],boolean[] vis, int curr ,int par)
     {
         vis[curr]= true;

         for(int i =0;i<graph[curr].size();i++)
         {
             Edge e = graph[curr].get(i);

             // if vis[e.dest] is true means that vertex coverd, and
             // if parent = e.dest means we are moving to our parent, thats why it is cyclic
             if(vis[e.dest] && par==e.dest)
             {
             return true;
             }

             if(!vis[e.dest])
             {
                  if(treedetect(graph, vis, e.dest ,curr))return true;
             }
         }

         return false;

     }

    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge>  graph[] = new ArrayList[v];
        boolean[] visited  = new boolean[v];

       TreeDetection tree = new TreeDetection();

       tree.createGrapgh(graph,v);

        System.out.println(tree.treedetect(graph, visited,0,-1));

    }

}
